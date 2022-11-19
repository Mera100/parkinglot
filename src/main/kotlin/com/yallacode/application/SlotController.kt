package com.yallacode.application

import com.yallacode.domain.model.SlotType
import com.yallacode.domain.service.SlotService
import javax.validation.Valid
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/slot")
@Slf4j
class SlotController {

    @Autowired
    private lateinit var slotService: SlotService

    @PostMapping
    fun bookSlot(@RequestBody request: BookSlotDto): ResponseEntity<String> {

        val slot = slotService.bookFreeSlot(request.parkingLotId.toLong(), SlotType.valueOf(request.slotType))
        return ResponseEntity.ok(slot.toString())
    }

    @PutMapping
    fun freeSlot(@Valid @RequestBody slotId: Long, @Valid @RequestBody parkingLotId: Long): ResponseEntity<String> {
        slotService.freeSlot(slotId, parkingLotId)
        return ResponseEntity.ok("slot was released")
    }
}