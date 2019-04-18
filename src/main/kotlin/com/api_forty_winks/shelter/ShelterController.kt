package com.api_forty_winks.shelter

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ShelterController {

    @RequestMapping("/shelters")
    @CrossOrigin
    fun getShelters() : ShelterList {
        val list = ShelterList()
        list.loadShelters()
        return list
    }
}