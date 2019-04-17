package com.api_forty_winks.shelter

import org.hamcrest.Matchers.equalTo
import io.restassured.module.mockmvc.RestAssuredMockMvc.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest

class ShelterControllerApiTests {
    @Test
    fun `It returns a json with a name`(){
        given().
                standaloneSetup(ShelterController()).
        `when`().
            get("/shelters").
            then().
            statusCode(200).
            body("name", equalTo("Makers"))
    }

}