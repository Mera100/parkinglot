package com.yallacode.repository

import com.yallacode.repository.entity.ParkingLot
import org.springframework.data.jpa.repository.JpaRepository


interface ParkingLotRepository : JpaRepository<ParkingLot, Long> {

}