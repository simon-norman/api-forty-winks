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

    @Test
    fun `It returns a price when called`(){
        val shelterParams = mutableMapOf<String,String>()
        shelterParams.put("name","Makers")
        shelterParams.put("price","20.00")
        val shelter = Shelter(shelterParams)
        assertEquals("20.00", shelter.price)
    }

    @Test
    fun `It returns a description when called`(){
        val shelterParams = mutableMapOf<String,String>()
        shelterParams.put("name","Makers")
        shelterParams.put("price","20.00")
        shelterParams.put("description","40-room hostel for men and women")
        val shelter = Shelter(shelterParams)
        assertEquals("40-room hostel for men and women", shelter.description)
    }

    @Test
    fun `It returns a location when called`(){
        val shelterParams = mutableMapOf<String,String>()
        shelterParams.put("name","Makers")
        shelterParams.put("price","20.00")
        shelterParams.put("description","40-room hostel for men and women")
        shelterParams.put("location","Commercial Street, Aldgate")
        val shelter = Shelter(shelterParams)
        assertEquals("Commercial Street, Aldgate", shelter.location)
    }
}