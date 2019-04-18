package com.api_forty_winks.voucher


import javax.persistence.*

@Entity
@Table(name = "vouchers")
class Voucher(amount: Float) {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var id: Long? = null

    var code: String? = null
    var amount: Float? = null

}