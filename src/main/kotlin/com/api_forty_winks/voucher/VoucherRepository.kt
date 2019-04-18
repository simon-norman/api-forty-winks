package com.api_forty_winks.voucher

import org.springframework.data.jpa.repository.JpaRepository

interface VoucherRepository : JpaRepository<Voucher, Long>