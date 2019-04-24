package com.api_forty_winks.voucher

import com.api_forty_winks.payment.AccessToken
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import net.minidev.json.JSONObject
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.web.context.WebServerInitializedEvent
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.context.annotation.Configuration
import org.springframework.context.event.EventListener
import org.springframework.core.env.Environment
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate
import java.io.Serializable
import javax.sound.sampled.Port

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)


//class newVoucherObject : Serializable {
//    var code : Long? = null
//}

class VoucherControllerApiTests {


    @Test
    fun `It returns updated voucher after a payment call`(){
//
//        val restTemplate = RestTemplate()
//        val auth0Url = "https://dev-itjmkjwl.eu.auth0.com/oauth/token"
//        val voucherUrl = "http://localhost:8080/voucher"
//
//        var headers = HttpHeaders()
//
//        headers.set("content-type", "application/json")
//        var data = "{\"amount\":\"10.00\"}"
//        var entity = HttpEntity(data, headers)
//        val newVoucherObject = restTemplate.postForObject(voucherUrl, entity, newVoucherObject::class.java)
//
//
//        headers = HttpHeaders()
//
//        headers.set("content-type", "application/json")
//        headers.set("Accept-Language", "en_US")
//        data = "{\"client_id\":\"c0Egr72COe3vxq0NSIwYmW9ayzTSNFiE\",\"client_secret\":\"CO9icNuaAmQZF0w8ONxJSJ3taM44SWAYSpjNGrrM9-nvMmpNjTXPUCa0f25QkLjh\",\"audience\":\"https://api-forty-winks.herokuapp.com/\",\"grant_type\":\"client_credentials\"}"
//        entity = HttpEntity(data, headers)
//        val authAccessToken = restTemplate.postForObject(auth0Url, entity, AccessToken::class.java)
//
//
//
//        val requestParams = JSONObject()
//        requestParams["email"] = "james@james.com"
//        requestParams["code"] = newVoucherObject?.code
//        requestParams["amount"] = "5.00"
//
//        given().
//            body(requestParams).
//            contentType(ContentType.JSON).
//            `when`().
//            post("/private/voucher/redeem").
//            then().
//            statusCode(200).
//            body("amount", equalTo(5.0f)).
//            body("code", equalTo(newVoucherObject?.code))
    }
}