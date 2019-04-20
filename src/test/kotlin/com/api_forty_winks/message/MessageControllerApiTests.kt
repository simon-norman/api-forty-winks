package com.api_forty_winks.message
import io.restassured.module.mockmvc.RestAssuredMockMvc.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest

class MessageControllerApiTests {
    @Test
    fun `It successfully sends a text message`(){
        given().
            standaloneSetup(MessageController()).
            `when`().
            get("/sendMessage").
            then().
            statusCode(200)
    }

}