package com.api_forty_winks.shelter

class Shelter(data: MutableMap<String,String>) {
   val name = data["name"]
   val price = data["price"]
   val description = data["description"]
   val location = data["location"]
   val mapurl = data["mapurl"]
}