package com.api_forty_winks.message

class Message(number : String, code : String, amount : String) {
    var number : String = number
    var code : String = code
    var amount : String = amount
    fun sendMessage() : String {
        var message = MessageApi()
        message.sendText(number, code, amount)
        return "success"
    }

}







