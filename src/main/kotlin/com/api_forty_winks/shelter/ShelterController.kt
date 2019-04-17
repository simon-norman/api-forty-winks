package com.api_forty_winks.shelter

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ShelterController {

    @RequestMapping("/shelters")
    fun getShelters() : ShelterList {
        val list = ShelterList()
        list.getShelters()
     return   list
    }
}