package com.kammradt.temperature

import java.time.LocalDateTime
import javax.ws.rs.QueryParam

class PeriodParams {
    @QueryParam("start")
    var start: String? = null

    @QueryParam("end")
    var end: String? = null
}

class Period(params: PeriodParams) {

    var start: LocalDateTime
    var end: LocalDateTime

    init {
        val now = LocalDateTime.now()
        val oneHourAgo = now.minusHours(1).toString()
        val current = now.toString()

        this.start = LocalDateTime.parse(params.start ?: oneHourAgo)
        this.end = LocalDateTime.parse(params.end ?: current)
    }
}
