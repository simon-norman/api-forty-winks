package com.api_forty_winks.voucher

import javax.persistence.*

@Entity
@Table(name = "voucher")
class Voucher(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var code: Long? = null,
    var amount: Float? = null
)
