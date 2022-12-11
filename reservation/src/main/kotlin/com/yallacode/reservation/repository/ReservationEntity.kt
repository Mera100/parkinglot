package com.yallacode.reservation.repository

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "reservation")
@Entity
@AllArgsConstructor
@NoArgsConstructor
class ReservationEntity {
    @Id
    @GeneratedValue
    var id: Long? = null
    var startTime:
}