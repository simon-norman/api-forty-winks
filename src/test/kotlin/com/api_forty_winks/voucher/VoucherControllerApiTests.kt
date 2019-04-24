package com.api_forty_winks.voucher

import com.api_forty_winks.payment.AccessToken

import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import net.minidev.json.JSONObject
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

class VoucherControllerApiTests {
    @Test
    fun `It returns updated voucher after a payment call`(){

        val restTemplate = RestTemplate()
        val auth0Url = "https://dev-itjmkjwl.eu.auth0.com/oauth/token"
        var headers = HttpHeaders()

        headers.set("content-type", "application/json")
        headers.set("Accept-Language", "en_US")
        val data = "{\"client_id\":\"c0Egr72COe3vxq0NSIwYmW9ayzTSNFiE\",\"client_secret\":\"CO9icNuaAmQZF0w8ONxJSJ3taM44SWAYSpjNGrrM9-nvMmpNjTXPUCa0f25QkLjh\",\"audience\":\"https://api-forty-winks.herokuapp.com/\",\"grant_type\":\"client_credentials\"}"
        var entity = HttpEntity(data, headers)
        val authAccessToken = restTemplate.postForObject(auth0Url, entity, AccessToken::class.java)





        val requestParams = JSONObject()
        requestParams["email"] = "james@james.com"
        requestParams["code"] = "4"
        requestParams["amount"] = "5.00"
        given().
            header("authorization", "Bearer ${authAccessToken?.access_token}").
            body(requestParams).
            contentType(ContentType.JSON).
            `when`().
            post("/private/voucher/redeem").
            then().
            statusCode(200).
            body("amount", equalTo("5.0")).
            body("code", equalTo("2"))
    }
}