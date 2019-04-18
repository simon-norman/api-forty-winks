package com.api_forty_winks.shelter

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ShelterController {

    @RequestMapping("/shelters")
    @CrossOrigin
    fun getShelters() : ShelterList {
        println("SHELTER CONTROLLER ABOUT TO INSTANTIATE SHELTERLIST")
        val list = ShelterList()
        println("SHELTER LIST INSIDE SHELTER CONTROLLER ${list}")
        list.getShelters()
        println("SHELTER  LIST INSIDE SHELTER CONTROLLER AFTER GET SHELTERS CALLED ${list}")
     return   list
    }
}