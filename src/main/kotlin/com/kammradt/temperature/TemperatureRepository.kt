package com.kammradt.temperature

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import io.quarkus.panache.common.Sort
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class TemperatureRepository : PanacheRepository<Temperature> {
    fun listByPeriod(period: Period): List<Temperature> {
        return list(
            "date BETWEEN ?1 and ?2",
            Sort.by("date").ascending(),
            period.start, period.end,
        )
    }
}