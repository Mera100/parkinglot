package com.yallacode.application

import com.google.gson.Gson
import com.yallacode.domain.service.SlotService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/slot")
@Slf4j
class SlotController {

    @Autowired
    private lateinit var slotService: SlotService
    private val parser = Gson()

    @PostMapping(produces = ["application/json"])
    fun bookSlot(@RequestBody request: BookSlotDto): ResponseEntity<String> {

        val slot = slotService.bookFreeSlot(request.parkingLotId, request.slotType)
        return ResponseEntity.ok(parser.toJson(slot))
    }

    @PutMapping("/{slotId}")
    fun freeSlot(@PathVariable slotId: Long): ResponseEntity<String> {
        slotService.freeSlot(slotId)
        return ResponseEntity.ok("slot was released")
    }
}