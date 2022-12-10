package com.yallacode.domain.service

import com.yallacode.domain.model.SlotType
import com.yallacode.domain.service.exceptions.NoFreeSlotFoundException
import com.yallacode.domain.service.exceptions.SlotAlreadyFreeException
import com.yallacode.domain.service.exceptions.SlotNotFoundException
import com.yallacode.repository.ParkingLotRepository
import com.yallacode.repository.SlotRepository
import com.yallacode.repository.entity.Slot
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SlotServiceImpl : SlotService {
    @Autowired
    private lateinit var slotRepository: SlotRepository
    @Autowired
    private lateinit var parkingLotRepository : ParkingLotRepository

    override fun bookFreeSlot(parkingLotId: Long, slotType: SlotType): Slot {
        var foundSlots = slotRepository.findAllByParkingLotIdAndTypeAndBooked(parkingLotId, slotType, false)
        if (foundSlots.isEmpty() && slotType != SlotType.NORMAL) {
            foundSlots = slotRepository.findAllByParkingLotIdAndTypeAndBooked(parkingLotId, SlotType.NORMAL, false)
        }
        if (foundSlots.isNotEmpty()) {
            val random = (foundSlots.indices).random()
            val slot = foundSlots[random]
            slot.booked = true
            return slotRepository.save(slot)
        } else {
            throw NoFreeSlotFoundException()
        }
    }

    override fun freeSlot(slotId: Long, parkingLotId: Long) {
        val slot = slotRepository.findByParkingLotIdAndId(parkingLotId, slotId).orElseThrow{ SlotNotFoundException() }
        if (slot.booked){
            slot.booked = false
        } else {
            throw SlotAlreadyFreeException()
        }
    }
}