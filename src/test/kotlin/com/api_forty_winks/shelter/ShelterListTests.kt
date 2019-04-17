package com.api_forty_winks.shelter

import junit.framework.TestCase
import org.assertj.core.api.Assertions.assertThat
import org.hamcrest.Matchers.hasSize
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
        list.getShelters()
        Assert.assertEquals(2, list.shelters.size)
    }

    @Test
    fun `It returns a list of Shelters`(){
        val list = ShelterList()
        list.getShelters()
        Assert.assertEquals("Makers", list.shelters[0].name)
    }
}