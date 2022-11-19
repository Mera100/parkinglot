package com.yallacode.repository.entity

import com.yallacode.domain.model.SlotType
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
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
    var slotNumber: Int,
    @ManyToOne
    var parkingLot: ParkingLot,
    @Enumerated(EnumType.STRING)
    var type: SlotType,
    var booked: Boolean
    ){
    override fun toString(): String {
        return "Slot(id=$id, slotNumber=$slotNumber, parkingLot=$parkingLot, type=$type, booked=$booked)"
    }
}
