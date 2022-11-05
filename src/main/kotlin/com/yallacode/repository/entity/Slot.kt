package com.yallacode.repository.entity

import com.yallacode.domain.model.SlotType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

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