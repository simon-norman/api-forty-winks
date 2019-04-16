package com.api_forty_winks.shelter

import com.api_forty_winks.shelter.Shelter
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ShelterController {

    @RequestMapping("/shelters")
    fun getShelters() : Shelter {
     return   Shelter()
    }
}