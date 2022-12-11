package com.yallacode.domain.model

import javax.persistence.*


@Entity
@Table(name="address")
class Address (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null,
    var longitude: Double,
    var latitude: Double
)
