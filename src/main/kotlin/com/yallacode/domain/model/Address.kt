package com.yallacode.domain.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="address")
class Address (
    @Id
    @GeneratedValue
    var id: Long? = null,
    var longitude: Double,
    var latitude: Double
)
