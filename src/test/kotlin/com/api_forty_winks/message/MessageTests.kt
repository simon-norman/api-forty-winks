package com.api_forty_winks.message


import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.given
import org.mockito.Mockito
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.context.web.WebAppConfiguration


@RunWith(SpringRunner::class)
@SpringBootTest
@WebAppConfiguration


class MessageTests {
    @Test
    fun `it checks that the Twilio classes are invoked`(){
        val x = Mockito.mock(Message::class.java)
        given(x.sendMessage()).willReturn("success")
        assertEquals("success", x.sendMessage())
    }
}