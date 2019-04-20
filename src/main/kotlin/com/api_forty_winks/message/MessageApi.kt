package com.api_forty_winks.message

import com.twilio.http.TwilioRestClient
import com.twilio.rest.api.v2010.account.MessageCreator
import com.twilio.type.PhoneNumber

class MessageApi {
    val ACCOUNT_SID: String = System.getenv("ACCOUNT_SID")
    val AUTH_TOKEN: String = System.getenv("AUTH_TOKEN")
    val TWILIO_PHONE_NUMBER: String = System.getenv("TWILIO_PHONE_NUMBER")

    fun sendText(number : String, code : String, amount : String) : String {
        val client = TwilioRestClient.Builder(ACCOUNT_SID, AUTH_TOKEN).build()
        val textMessage = MessageCreator(
            PhoneNumber(number),
            PhoneNumber(TWILIO_PHONE_NUMBER),
            "Hello, a kind stranger has donated a Forty Winks Voucher - Code: "
                    + code +
                    " Amount: £" + amount).create(client)

        return textMessage.body
    }
}