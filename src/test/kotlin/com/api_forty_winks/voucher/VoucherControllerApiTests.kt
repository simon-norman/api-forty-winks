package com.api_forty_winks.voucher

import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import net.minidev.json.JSONObject
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

class VoucherControllerApiTests {
    @Test
    fun `It returns updated voucher after a payment call`(){
        val requestParams = JSONObject()
        requestParams["email"] = "james@james.com"
        requestParams["code"] = "FW1"
        requestParams["amount"] = "15.00"
        given().
            body(requestParams).
            contentType(ContentType.JSON).
            `when`().
            post("/voucher/redeem").
            then().
            statusCode(200).
            body("amount", equalTo("5.00")).
            body("code", equalTo("FW1"))
    }
}