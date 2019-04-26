package com.api_forty_winks.payment

import java.util.*

class Redemption (email : String, code : String, amount : String) {
    var email: String = email
    var code: String = code
    var amount: String = amount
    var paypalBatchId = Random()


    fun createJSON() : String {

      val  payment = "{\"sender_batch_header\": {\"sender_batch_id\": \"$paypalBatchId\",\"email_subject\": \"You have a payout!\",\"email_message\": \"You have received a payout! Thanks for using our service!\"},\"items\": [{\"recipient_type\": \"EMAIL\",\"amount\": {\"value\": \"$amount\",\"currency\": \"GBP\" },\"note\": \"Thanks for your patronage!\",\"sender_item_id\": \"201403140001\",\"receiver\": \"$email\" }] }"

        return payment

    }
}
