package com.api_forty_winks.shelter


import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.junit.Before
import org.springframework.test.context.web.WebAppConfiguration


@RunWith(SpringRunner::class)
@SpringBootTest
@WebAppConfiguration
class ShelterTests {
    private var shelterParams = mutableMapOf<String, String>()
    private lateinit var shelter :Shelter

    @Before
    fun testSetUp() {
        shelterParams.put("name","Makers")
        shelterParams.put("price","20.00")
        shelterParams.put("description","40-room hostel for men and women")
        shelterParams.put("location","Commercial Street, Aldgate")

        shelter = Shelter(shelterParams)
    }

    @Test
    fun `It returns a name when called`(){
        assertEquals("Makers", shelter.name)
    }

    @Test
    fun `It returns a price when called`(){
        assertEquals("20.00", shelter.price)
    }

    @Test
    fun `It returns a description when called`(){
        assertEquals("40-room hostel for men and women", shelter.description)
    }

    @Test
    fun `It returns a location when called`(){
        assertEquals("Commercial Street, Aldgate", shelter.location)
    }
}