package com.yallacode.reservation.domain.service

import java.time.LocalDateTime

interface ReservationService {

    fun findAvailableParkLots(startTime: LocalDateTime, endTime: LocalDateTime, city: String)

}