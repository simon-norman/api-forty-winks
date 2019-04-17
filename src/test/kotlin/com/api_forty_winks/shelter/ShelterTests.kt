package com.api_forty_winks.shelter


import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ShelterTests {
    @Test
    fun `It returns a name when called`(){
        val shelterParams = mutableMapOf<String,String>()
        shelterParams.put("name","Makers")
        val shelter = Shelter(shelterParams)
        assertEquals("Makers", shelter.name)
    }
}