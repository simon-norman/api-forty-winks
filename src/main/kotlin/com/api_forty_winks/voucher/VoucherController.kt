package com.api_forty_winks.voucher

import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class VoucherController(val voucherRepository: VoucherRepository) {

    @PostMapping("/voucher")
    @CrossOrigin
    fun newVoucher(@RequestBody voucher: Voucher) : Voucher {
        println(voucher.amount)
        voucherRepository.save(voucher)
        return voucher
    }

    @GetMapping("/voucher")
    @CrossOrigin
    fun getVoucher(@RequestParam("code") code : Long) : Voucher {
        println(code)
        var v = voucherRepository.getOne(code)
        return v
    }
}