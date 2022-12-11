package com.yallacode.repository.entity

import com.yallacode.domain.model.SlotType
import javax.persistence.*

@Entity
@Table(name="slot")
class Slot(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var slotNumber: Int,
    @ManyToOne
    var parkingLot: ParkingLot,
    @Enumerated(EnumType.STRING)
    var type: SlotType,
    var booked: Boolean
    )
