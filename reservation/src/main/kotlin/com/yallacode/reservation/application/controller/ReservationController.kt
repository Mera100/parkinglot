package com.yallacode.reservation.application.controller

import com.yallacode.reservation.application.incoming.SlotQueryDTO
import com.yallacode.reservation.domain.service.ReservationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/reservation")
class ReservationController(
    val reservationService: ReservationService
) {

    @GetMapping("find-available-parkings")
    fun findAvailableParkingLots(@RequestBody slotQueryDTO: SlotQueryDTO){


    }
}