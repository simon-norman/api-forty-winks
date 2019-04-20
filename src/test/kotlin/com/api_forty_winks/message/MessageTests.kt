package com.api_forty_winks.message

import com.twilio.http.TwilioRestClient

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@RunWith(SpringRunner::class)
@SpringBootTest


class MessageTests {
//    @Test
//    fun `it checks that the Twilio classes are invoked`(){
//        val tw = Mockito.mock(TwilioRestClient.Builder::class.java)
//        val message = Message()
//        message.sendText()
//        verify(tw).build()
//
//    }
}