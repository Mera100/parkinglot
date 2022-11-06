package com.yallacode.domain.service

import com.yallacode.domain.model.SlotType
import com.yallacode.repository.SlotRepository
import com.yallacode.repository.entity.ParkingLot
import com.yallacode.repository.entity.Slot
import java.util.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SlotServiceImpl : SlotService {
    @Autowired
    private lateinit var slotRepository: SlotRepository

    override fun bookFreeSlot(parkingLot: ParkingLot, slotType: SlotType): Optional<Slot> {
        var foundSlots = slotRepository.findAllByParkingLotAndType(parkingLot, slotType)
        if (foundSlots.isEmpty() && slotType != SlotType.NORMAL) {
            foundSlots = slotRepository.findAllByParkingLotAndType(parkingLot, SlotType.NORMAL)
        }
        if (foundSlots.isNotEmpty()) {
            val random = (foundSlots.indices).random()
            val slot = foundSlots[random]
            slot.booked = true
            val savedSlot = slotRepository.save(slot)
            return Optional.of(savedSlot)
        }
        return Optional.empty()
    }

    override fun freeSlot(slotId: Long) {
        TODO("Not yet implemented")
    }
}