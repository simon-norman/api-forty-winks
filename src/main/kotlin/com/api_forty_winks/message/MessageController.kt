package com.api_forty_winks.message

import org.springframework.web.bind.annotation.*

@RestController
class MessageController {
    @PostMapping("/message")
    @CrossOrigin
    fun sendMessage(@RequestBody message : Message) : Message {
        message.sendMessage()
        return message
    }
}