package com.api_forty_winks.shelter

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ShelterListTests {
    @Test
    fun `It returns a list`(){
        val list = ShelterList()
        list.loadShelters()
        Assert.assertEquals(10, list.shelters.size)
    }

    @Test
    fun `It returns a list of Shelters`(){
        val list = ShelterList()
        list.loadShelters()
        Assert.assertEquals("Providence Row HA - Middle Street Project", list.shelters[0].name)
    }
}