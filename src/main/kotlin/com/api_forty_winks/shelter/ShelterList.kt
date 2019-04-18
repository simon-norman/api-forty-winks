package com.api_forty_winks.shelter

class ShelterList {
    var shelters: MutableList<Shelter> = ArrayList()

    fun loadShelters() {
        var sheltersRaw: MutableList<MutableMap<String,String>> = ArrayList()
        val shelterData1 = mutableMapOf<String,String>()
        shelterData1["name"] = "Makers"
        shelterData1["price"] = "20.00 per week"
        shelterData1["description"] = "42 Bed Hostel for Single Homeless People"
        shelterData1["location"] = "Makers, Commercial Street, Aldgate"
        shelterData1["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2482.775190063928!2d-0.07546948370755205!3d51.51734027963696!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761caf26599a83%3A0x9b451d586c649129!2sMakers!5e0!3m2!1sen!2suk!4v1555605494841!5m2!1sen!2suk"
        val shelterData2 = mutableMapOf<String,String>()
        shelterData2["name"] = "Mile End Shelter"
        shelterData2["price"] = "15.00"
        shelterData2["description"] = "15 Bed Shelter for Men"
        shelterData2["location"] = "Mile End, London"
        sheltersRaw.add(shelterData1)
        sheltersRaw.add(shelterData2)
        sheltersRaw.forEach { shelters.add(Shelter(it)) }
    }
}
