package com.yallacode.reservation.domain.service.impl

import com.yallacode.reservation.domain.service.ReservationService
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ReservationServiceImpl : ReservationService {
    override fun findAvailableParkLots(
        startTime: LocalDateTime,
        endTime: LocalDateTime,
        city: String
    ) {




    }
}