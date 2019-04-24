package com.api_forty_winks.payment

import com.fasterxml.jackson.annotation.JsonCreator
import org.springframework.boot.jackson.JsonObjectSerializer

class Redemption (email : String, code : String, amount : String) {
    var email: String = email
    var code: String = code
    var amount: String = amount


    fun createJSON() {
      val  payment = "{\"name\":\"name\",\"email\":\"email@gmail.com\"}";

       payment = JsonObjectSerializer

        JSON.parse
    }
}