package com.yallacode.reservation.repository

import org.springframework.data.repository.CrudRepository

interface ReservationRepository : CrudRepository<ReservationEntity, Long>