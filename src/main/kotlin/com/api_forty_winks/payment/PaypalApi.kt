package com.api_forty_winks.payment

import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate



class PaypalApi {
    fun createPayment(redemption: Redemption) : ResponseEntity<String> {
        val restTemplate = RestTemplate()
        val paypalTokenUrl = "https://api.sandbox.paypal.com/v1/oauth2/token"
        var headers = HttpHeaders()

        headers.set("Accept", "application/json")
        headers.set("Accept-Language", "en_US")
        headers.setBasicAuth("ASYuw4VE7eyILUM6c47nrJj2kHrMfWYRhu0fCKNfeFtetB6T8JSj_WLAS95GjkUHsG2xhfPJKaQtXZiU",
            "EOBMt7N9x-kZzCaEQfSvU-q_Wbwxuh6_xxn_3XZjIgdOOiM2Mzc_GR1B2oRF5G2b2y1BL1OIxbbKfW4m")
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