package com.api_forty_winks.message

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageController {
    @RequestMapping("/sendMessage")
    fun sendMessage() : String {
        val message = Message()
        return message.sendText()
    }
}