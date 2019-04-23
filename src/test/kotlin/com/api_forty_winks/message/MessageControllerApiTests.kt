package com.api_forty_winks.message

import io.restassured.http.ContentType
import io.restassured.module.mockmvc.RestAssuredMockMvc.*
import net.minidev.json.JSONObject
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc

class MessageControllerApiTests {
    @Test
    fun `It successfully sends a text message`(){
        val requestParams = JSONObject()
        requestParams["number"] = "+447722066721"
        requestParams["code"] = "FW5"
        requestParams["amount"] = "26.00"
        given().
            contentType(ContentType.JSON).
            body(requestParams).
            standaloneSetup(MessageController()).
        `when`().
            post("/message").
        then().
            statusCode(200).
                body("amount", equalTo("26.00"))
    }
}