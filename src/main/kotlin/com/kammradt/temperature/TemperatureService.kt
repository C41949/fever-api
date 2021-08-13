package com.kammradt.temperature

import com.kammradt.exec
import javax.enterprise.context.ApplicationScoped
import javax.inject.Inject
import javax.transaction.Transactional

@ApplicationScoped
class TemperatureService {
    private val command = "cat /sys/class/thermal/thermal_zone0/temp"

    @Inject
    private lateinit var repository: TemperatureRepository

    @Transactional
    fun create(): Temperature {
        return Temperature().also {
            it.temperature = command.exec().toFloat().div(1000)
            it.persist()
        }
    }

    fun list(period: Period): List<Temperature> = repository.listByPeriod(period)
}