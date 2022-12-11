package com.yallacode.reservation.application.controller

import com.yallacode.reservation.domain.service.ReservationService
import org.springframework.web.bind.annotation.RestController

@RestController
class ReservationController(
    val reservationService: ReservationService
) {
}