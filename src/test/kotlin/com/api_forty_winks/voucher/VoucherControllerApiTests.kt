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


//class newVoucherObject : Serializable {
//    var code : Long? = null
//}

class VoucherControllerApiTests {


    @Test
    fun `It returns updated voucher after a payment call`(){

        val AUTH_CLIENT_ID : String = System.getenv("AUTH_CLIENT_ID")
        val AUTH_CLIENT_SECRET : String = System.getenv("AUTH_CLIENT_SECRET")
        val restTemplate = RestTemplate()
        val auth0Url = "https://dev-itjmkjwl.eu.auth0.com/oauth/token"
        var data = "{\"amount\":\"10.00\"}"

        val newCode : Int =
            given().contentType("application/json").body(data).
                `when`().post("/voucher").
                    then().statusCode(200).body("amount", equalTo(10.0f)).
                        extract().path("code")


        val headers = HttpHeaders()

        headers.set("content-type", "application/json")
        headers.set("Accept-Language", "en_US")
        data = "{\"client_id\":\"$AUTH_CLIENT_ID\",\"client_secret\":\"$AUTH_CLIENT_SECRET\",\"audience\":\"https://api-forty-winks.herokuapp.com/\",\"grant_type\":\"client_credentials\"}"
        val entity = HttpEntity(data, headers)
        val authAccessToken = restTemplate.postForObject(auth0Url, entity, AccessToken::class.java)



        val requestParams = JSONObject()
        requestParams["email"] = "james@james.com"
        requestParams["code"] = newCode
        requestParams["amount"] = "5.00"

        given().
            header("Authorization", "Bearer ${authAccessToken?.access_token}").
            body(requestParams).
            contentType(ContentType.JSON).
            `when`().
            post("/private/voucher/redeem").
            then().
            statusCode(200).
            body("amount", equalTo(5.0f)).
            body("code", equalTo(newCode))
    }
}