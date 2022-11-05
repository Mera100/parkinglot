package com.yallacode.repository.entity

import com.yallacode.domain.model.Address
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name="parkinglot")
class ParkingLot (
    @Id
    @GeneratedValue
    var id: Long? = null,
    var name: String,
    @ManyToOne
    var address: Address
)
