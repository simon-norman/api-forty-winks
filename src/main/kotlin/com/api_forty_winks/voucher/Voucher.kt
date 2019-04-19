package com.api_forty_winks.voucher

import javax.persistence.*

@Entity
@Table(name = "voucher")
@Embeddable
class Voucher(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var code: Long,
    var amount: Float? = null
) {
    fun Voucher() {}
}
