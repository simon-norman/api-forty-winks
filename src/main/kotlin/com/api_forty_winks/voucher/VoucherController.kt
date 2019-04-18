package com.api_forty_winks.voucher

import org.springframework.web.bind.annotation.*

@RestController
class VoucherController(val voucherRepository: VoucherRepository) {

    @PostMapping("/voucher")
    @CrossOrigin
    fun newVoucher(@RequestBody voucher: Voucher) : Voucher {
        println(voucher.amount)
        voucherRepository.save(voucher)
        return voucher
    }
}