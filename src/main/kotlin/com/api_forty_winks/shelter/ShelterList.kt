package com.api_forty_winks.shelter

class ShelterList {
    var shelters: MutableList<Shelter> = ArrayList()

    fun getShelters() {
        val shelterData = arrayOf({"Mile End Shelter"},{"Aldgate Shelter"})
        shelterData.forEach { shelters.add(Shelter()) }
    }
}
