package com.yallacode.domain.service

import com.yallacode.domain.model.SlotType
import com.yallacode.repository.entity.Slot

interface SlotService {
    fun bookFreeSlot(parkingLotId: Long, slotType: SlotType): Slot
    fun freeSlot(slotId: Long)
}