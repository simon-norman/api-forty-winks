package com.api_forty_winks.shelter

class ShelterList {
    var shelters: MutableList<Shelter> = ArrayList()

    fun getShelters() {
        println("START OF GET SHELTERS")
        var sheltersRaw: MutableList<MutableMap<String,String>> = ArrayList()
        val shelterData1 = mutableMapOf<String,String>()
        shelterData1["name"] = "Makers"
        shelterData1["price"] = "20.00"
        shelterData1["description"] = "40 Bed Hostel for Men and Women"
        shelterData1["location"] = "Makers, Commercial Street, Aldgate"
        val shelterData2 = mutableMapOf<String,String>()
        shelterData2["name"] = "Mile End Shelter"
        shelterData2["price"] = "15.00"
        shelterData2["description"] = "15 Bed Shelter for Men"
        shelterData2["location"] = "Mile End, London"
        sheltersRaw.add(shelterData1)
        sheltersRaw.add(shelterData2)
        sheltersRaw.forEach { shelters.add(Shelter(it)) }
        println("SHOW SHELTERS AT END OF GET SHELTERS: ${shelters}")
    }
}
