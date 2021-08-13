package com.kammradt.temperature

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Temperature : PanacheEntity() {

    @Column(nullable = false)
    var temperature: Float = 0F

    @Column(nullable = false)
    var date: LocalDateTime = LocalDateTime.now()
}
