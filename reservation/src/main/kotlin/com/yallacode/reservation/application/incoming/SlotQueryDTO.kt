package com.yallacode.reservation.application.incoming

import java.time.LocalDateTime

data class SlotQueryDTO(

    val startTime: LocalDateTime,
    val endTime: LocalDateTime,
    val location: String
)