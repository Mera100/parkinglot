package com.yallacode.repository

import com.yallacode.domain.model.SlotType
import com.yallacode.repository.entity.ParkingLot
import com.yallacode.repository.entity.Slot
import org.springframework.data.jpa.repository.JpaRepository

interface SlotRepository : JpaRepository<Slot, Long> {
    fun findAllByParkingLotAndType(parkingLot: ParkingLot, type: SlotType): List<Slot>
}