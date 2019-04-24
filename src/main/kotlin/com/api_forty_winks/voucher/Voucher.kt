package com.api_forty_winks.voucher

import javax.persistence.*

@Entity
@Table(name = "voucher")
@Embeddable
class Voucher(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var code: Long,
    var amount: Float
) {
    fun reduceAmount(byAmount: Float) {
        this.amount = this.amount - byAmount
    }
}
