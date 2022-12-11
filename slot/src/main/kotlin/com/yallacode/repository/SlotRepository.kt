package com.yallacode.repository

import com.yallacode.domain.model.SlotType
import com.yallacode.repository.entity.Slot
import java.util.*
import org.springframework.data.jpa.repository.JpaRepository

interface SlotRepository : JpaRepository<Slot, Long> {
    fun findAllByParkingLotIdAndTypeAndBooked(parkingLotId: Long, type: SlotType, booked: Boolean): List<Slot>

    fun findByParkingLotIdAndId(parkingLotId: Long, slotId: Long): Optional<Slot>
}