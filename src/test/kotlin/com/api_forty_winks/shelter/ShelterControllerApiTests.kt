package com.api_forty_winks.shelter

import org.hamcrest.Matchers.equalTo
import io.restassured.module.mockmvc.RestAssuredMockMvc.*
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration

@RunWith(SpringRunner::class)
@SpringBootTest
@WebAppConfiguration
class ShelterControllerApiTests {
    @Test
    fun `It returns a json with a name`(){
        given().
                standaloneSetup(ShelterController()).
        `when`().
            get("/shelters").
            then().
            statusCode(200).
            body("shelters[0].name", equalTo("Providence Row HA - Middle Street Project"))
    }

}