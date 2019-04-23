package com.api_forty_winks.shelter

class ShelterList {
    var shelters: MutableList<Shelter> = ArrayList()

    fun loadShelters() {
        var sheltersRaw: MutableList<MutableMap<String,String>> = ArrayList()

        val shelterData1 = mutableMapOf<String,String>()
        shelterData1["name"] = "Providence Row HA - Middle Street Project"
        shelterData1["price"] = "20.00 per week"
        shelterData1["description"] = "Single homeless people, including rough sleepers with low support needs. Must be willing to engage in keyworking and action planning. Priority to those with a local connection to the City of London. Target 20% women."
        shelterData1["location"] = "18-21 Middle Street, London, EC1A 7JA"
        shelterData1["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2482.660585725897!2d-0.10077358422957124!3d51.519442679637095!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761b5416f7ef2f%3A0xa0e8e452b6ae3ea6!2sMiddle+St%2C+Barbican%2C+London+EC1A+7JA!5e0!3m2!1sen!2suk!4v1555751671613!5m2!1sen!2suk"
        sheltersRaw.add(shelterData1)

        val shelterData2 = mutableMapOf<String,String>()
        shelterData2["name"] = "Spitalfields Crypt Trust - Acorn House"
        shelterData2["price"] = "15.00 per week"
        shelterData2["description"] = "Single homeless men aged 25+ with alcohol or drug problems, including rough sleepers and those with low-medium mental health support needs. No local connection required. Must be prepared to address their addiction in an abstinence-based rehabilitation setting."
        shelterData2["location"] = "116-118 Shoreditch High Street, London, E1 6JN"
        shelterData2["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2482.2678944316494!2d-0.07944458422932246!3d51.526646079638226!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761cba12f5fd1f%3A0xd3d954b5bdd74db5!2sShoreditch+High+St%2C+London+E1+6JN!5e0!3m2!1sen!2suk!4v1555754663164!5m2!1sen!2suk"
        sheltersRaw.add(shelterData2)

        val shelterData3 = mutableMapOf<String,String>()
        shelterData3["name"] = "Peter Bedford Housing Association - Hackney"
        shelterData3["price"] = "2.00 per night"
        shelterData3["description"] = "Single people aged 21-65 who are homeless or living in inappropriate or insecure accommodation, and those with mental health issues or learning disabilities. Priority to those with a local connection to LB Hackney."
        shelterData3["location"] = "242-248 Kingland Rd, London, E8 4DG"
        shelterData3["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2481.6540326761847!2d-0.07846528472955347!3d51.537905116294105!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761c9678049847%3A0x8486ef57307dc9f4!2sKingsland+Rd%2C+Haggerston%2C+London+E8+4DG!5e0!3m2!1sen!2suk!4v1555758035108!5m2!1sen!2suk"
        sheltersRaw.add(shelterData3)

        val shelterData4 = mutableMapOf<String,String>()
        shelterData4["name"] = "Providence Row HA - Elsdale Street"
        shelterData4["price"] = "20.00 per week"
        shelterData4["description"] = "Rough sleepers aged 18-65 with support needs, including those with drug and alcohol misuse and mental health issues. Must have a local connection. Can accept up to 3 people with dogs."
        shelterData4["location"] = "15 Elsdale Street, London, E9 6QY"
        shelterData4["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2481.375653489101!2d-0.05129088422873431!3d51.543010379641!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761ce245e5248b%3A0xbba0a16de957e388!2sElsdale+St%2C+London+E9+6QY!5e0!3m2!1sen!2suk!4v1555758283893!5m2!1sen!2suk"
        sheltersRaw.add(shelterData4)

        val shelterData5 = mutableMapOf<String,String>()
        shelterData5["name"] = "St Mungo's - Mare Street Hostel"
        shelterData5["price"] = "4.00 per night"
        shelterData5["description"] = "Single homeless people with medium-high support needs, including rough sleepers, those with substance use/mental health/complex needs and some ex-offender groups. At least 25 % of the client group must be women. Can accept people with dogs."
        shelterData5["location"] = "146 Mare Street, London, E8 3SG"
        shelterData5["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2481.6191250103902!2d-0.058769684729520044!3d51.5385453162472!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761ce653dac5c3%3A0x70cdf98f6092d890!2sMare+St%2C+London+E8+3SG!5e0!3m2!1sen!2suk!4v1555758748913!5m2!1sen!2suk"
        sheltersRaw.add(shelterData5)

        val shelterData6 = mutableMapOf<String,String>()
        shelterData6["name"] = "North London YMCA"
        shelterData6["price"] = "2.00 per night"
        shelterData6["description"] = "Young single homeless people aged 18-35, including ex-offenders, refugees and young people leaving care."
        shelterData6["location"] = "184 Tottenham Lane, London, N8 8SG"
        shelterData6["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2479.2398704278894!2d-0.12304648472768556!3d51.582167013055496!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761bc19fd44b49%3A0xc376b87e2f98a7ba!2sCrouch+End%2C+London+N8+8SG!5e0!3m2!1sen!2suk!4v1555759801452!5m2!1sen!2suk"
        sheltersRaw.add(shelterData6)

        val shelterData7 = mutableMapOf<String,String>()
        shelterData7["name"] = "London Cyrenians Housing"
        shelterData7["price"] = "15.00 per week"
        shelterData7["description"] = "Single people with support needs, eg homeless people, people with mental health or substance misuse problems, mothers and babies, care leavers, rough sleepers, young people at risk, refugees. "
        shelterData7["location"] = "52 Rochester Row, London, SW1P 1JU"
        shelterData7["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2484.038824576094!2d-0.13928498473138962!3d51.494155019493235!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x487604de25033eb7%3A0x72b67cf533e255d8!2sRochester+Row%2C+Westminster%2C+London+SW1P+1JU!5e0!3m2!1sen!2suk!4v1555760219983!5m2!1sen!2suk"
        sheltersRaw.add(shelterData7)

        val shelterData8 = mutableMapOf<String,String>()
        shelterData8["name"] = "St Mungo's - The Lodge at St Ursula's"
        shelterData8["price"] = "2.00 per night"
        shelterData8["description"] = "Entrenched, long term rough sleepers with low support needs. Accept people with dogs. Will consider couples."
        shelterData8["location"] = "16 Brooke Street, London, EC1N 7RB"
        shelterData8["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2482.6462905851095!2d-0.1126448847303105!3d51.519704917625084!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761b4c198d81f5%3A0x57c8f63e807d9028!2sHolborn%2C+London+EC1N+7RB!5e0!3m2!1sen!2suk!4v1555760885966!5m2!1sen!2suk"
        sheltersRaw.add(shelterData8)

        val shelterData9 = mutableMapOf<String,String>()
        shelterData9["name"] = "SHP - Frederick Street"
        shelterData9["price"] = "25.00 per week"
        shelterData9["description"] = "Young, vulnerable single homeless people aged 16-21 with medium-high support needs. Connection to LB Camden required. Will accept clients on probation, licence or community service. Target 50% women, 50% people from black and minority ethnic groups."
        shelterData9["location"] = "5-7 Frederick Street, London, WC1X 0NG"
        shelterData9["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2482.1843598883606!2d-0.11830928472994272!3d51.52817831700551!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761b470abba135%3A0xe186ab87b9e86e4c!2sFrederick+St%2C+London+WC1X+0NG!5e0!3m2!1sen!2suk!4v1555761039501!5m2!1sen!2suk"
        sheltersRaw.add(shelterData9)

        val shelterData0 = mutableMapOf<String,String>()
        shelterData0["name"] = "Salvation Army - Cambria House"
        shelterData0["price"] = "3.00 per night"
        shelterData0["description"] = "Single homeless men aged 18+ with low to medium support needs who require assistance with developing independent living skills. 2 beds for single homeless men who are registered disabled."
        shelterData0["location"] = "37 Hunter Street, London, WC1N 1BJ"
        shelterData0["mapurl"] = "https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2482.3113043813714!2d-0.12599658473005426!3d51.52584981717579!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48761b3a046ac8c7%3A0x67e9011515119add!2sHunter+St%2C+Bloomsbury%2C+London+WC1N+1BJ!5e0!3m2!1sen!2suk!4v1555761182587!5m2!1sen!2suk"
        sheltersRaw.add(shelterData0)

        println(sheltersRaw)

        sheltersRaw.forEach { shelters.add(Shelter(it)) }
    }
}
