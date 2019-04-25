package com.api_forty_winks.payment

import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate



class PaypalApi {
    val PAYPAL_USER_NAME : String = System.getenv("PAYPAL_USER_NAME")
    val PAYPAL_PASSWORD : String = System.getenv("PAYPAL_PASSWORD")
    fun createPayment(redemption: Redemption) : ResponseEntity<String> {
        val restTemplate = RestTemplate()
        val paypalTokenUrl = "https://api.sandbox.paypal.com/v1/oauth2/token"
        var headers = HttpHeaders()

        headers.set("Accept", "application/json")
        headers.set("Accept-Language", "en_US")
        headers.setBasicAuth(PAYPAL_USER_NAME,
            PAYPAL_PASSWORD)
        var entity = HttpEntity("grant_type=client_credentials", headers)
        val accessToken = restTemplate.postForObject(paypalTokenUrl, entity, AccessToken::class.java)


        val paypalPaymentUrl = "https://api.sandbox.paypal.com/v1/payments/payouts"
        headers = HttpHeaders()
        headers.set("Authorization", "Bearer ${accessToken?.access_token}")
        headers.set("Content-Type", "application/json")
        val paymentDetails = redemption.createJSON()
        entity = HttpEntity(paymentDetails, headers)
        val response = restTemplate.postForEntity(paypalPaymentUrl, entity, String::class.java)
        return response


    }
}