package com.yallacode.repository.entity

import com.yallacode.domain.model.Address
import javax.persistence.*

@Entity
@Table(name="parking_lot")
class ParkingLot (
    @Id
    @GeneratedValue
    var id: Long? = null,
    var name: String,
    @ManyToOne
    var address: Address
)
