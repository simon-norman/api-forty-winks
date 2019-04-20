package com.api_forty_winks.message

import com.twilio.http.TwilioRestClient
import com.twilio.rest.api.v2010.account.MessageCreator



class Message {
    val ACCOUNT_SID = "AC52b6df9fca81f388cfa0dcdb8d6a09aa"
    val AUTH_TOKEN = "c01a66ea18bc5978da95d7d1135a770a"
    val TWILIO_PHONE_NUMBER = "+441249400064"
    fun sendText() : String {
        val client = TwilioRestClient.Builder("AC52b6df9fca81f388cfa0dcdb8d6a09aa", "c01a66ea18bc5978da95d7d1135a770a").build()
        val textMessage = MessageCreator(
            com.twilio.type.PhoneNumber("+447540166527"),
            com.twilio.type.PhoneNumber("+441249400064"), "Hi there just testing").create(client)

        println("This is the text message Sid" + textMessage.getSid())

        return textMessage.getSid()
    }
}







