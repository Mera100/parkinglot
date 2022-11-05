package com.yallacode.domain.service

import com.yallacode.domain.model.SlotType
import com.yallacode.repository.entity.ParkingLot
import com.yallacode.repository.entity.Slot
import java.util.*


interface SlotService {
    fun bookFreeSlot(parkingLot: ParkingLot, slotType: SlotType): Optional<Slot>
    fun freeSlot(slotId: Long)
}