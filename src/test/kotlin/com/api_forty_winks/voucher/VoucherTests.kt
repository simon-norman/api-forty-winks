package com.api_forty_winks.voucher

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@RunWith(SpringRunner::class)
@SpringBootTest
class VoucherTests {
    @Test
    fun `It creates a new voucher for a given amount`(){
        var voucher = Voucher(20.00)
        assertEquals("1", voucher.code)
    }

}