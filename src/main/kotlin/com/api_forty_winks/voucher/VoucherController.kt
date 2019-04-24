package com.api_forty_winks.voucher

import com.api_forty_winks.payment.Redemption
import com.api_forty_winks.payment.PaypalApi
import org.springframework.web.bind.annotation.*

@RestController
class VoucherController(val voucherRepository: VoucherRepository) {

    @PostMapping("/voucher")
    @CrossOrigin
    fun newVoucher(@RequestBody voucher: Voucher) : Voucher {
        voucherRepository.save(voucher)
        return voucher
    }

    @PostMapping("/private/voucher/redeem")
    @CrossOrigin
    fun redeemVoucher(@RequestBody redemption : Redemption) : Voucher {
        val paypalApi = PaypalApi()
        paypalApi.createPayment(redemption)

        val voucher = voucherRepository.getOne(redemption.code.toLong())
        voucher.reduceAmount(redemption.amount.toFloat())
        voucherRepository.save(voucher)

        return voucher
    }

    @GetMapping("/voucher")
    @CrossOrigin
    fun getVoucher(@RequestParam("code") code : Long) : Voucher {
        var v = voucherRepository.getOne(code)
        return v
    }


}