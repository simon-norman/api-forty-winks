package com.api_forty_winks.voucher

import org.springframework.web.bind.annotation.*
import org.springframework.http.ResponseEntity

@RestController
class VoucherController(val voucherRepository: VoucherRepository) {

    @PostMapping("/voucher")
    @CrossOrigin
    fun newVoucher(@RequestBody voucher: Voucher) : Voucher {
        voucherRepository.save(voucher)
        return voucher
    }

    @PostMapping("private/vouchers/1/redemption")
    @CrossOrigin
    fun redeemVoucher() : ResponseEntity<Unit> {
        return ResponseEntity.ok().build()
    }

    @GetMapping("/voucher")
    @CrossOrigin
    fun getVoucher(@RequestParam("code") code : Long) : Voucher {
        var v = voucherRepository.getOne(code)
        return v
    }
}