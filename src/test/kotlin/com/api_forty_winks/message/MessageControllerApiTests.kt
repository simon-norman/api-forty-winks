package com.api_forty_winks.message

import com.api_forty_winks.ApiFortyWinks
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import net.minidev.json.JSONObject
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

class MessageControllerApiTests {
    @Test
    fun `It successfully sends a text message`(){
        val requestParams = JSONObject()
        requestParams["number"] = "+447722066721"
        requestParams["code"] = "FW5"
        requestParams["amount"] = "26.00"
        given().
            body(requestParams).
            contentType(ContentType.JSON).
        `when`().
            post("/message").
        then().
            statusCode(200).
                body("amount", equalTo("26.00"))
    }
}