package com.api_forty_winks.shelter

class ShelterList {
    var shelters: MutableList<Shelter> = ArrayList()

    fun getShelters() {
        var sheltersRaw: MutableList<MutableMap<String,String>> = ArrayList()
        val shelterData1 = mutableMapOf<String,String>()
        shelterData1["name"] = "Makers"
        val shelterData2 = mutableMapOf<String,String>()
        shelterData2["name"] = "Mile End Shelter"
        sheltersRaw.add(shelterData1)
        sheltersRaw.add(shelterData2)
        sheltersRaw.forEach { shelters.add(Shelter(it)) }
    }
}
