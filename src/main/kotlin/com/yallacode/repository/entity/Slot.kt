package com.yallacode.repository.entity

import com.yallacode.domain.model.SlotType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name="slot")
class Slot(
    @Id
    @GeneratedValue
    var id: Long? = null,
    @ManyToOne
    var parkingLot: ParkingLot,
    var type: SlotType,
    var booked: Boolean,
    var occupied: Boolean
    )