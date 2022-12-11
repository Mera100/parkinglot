package com.yallacode.reservation.repository

import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "reservation")
@Entity
@AllArgsConstructor
@NoArgsConstructor
data class ReservationEntity (
    @Id
    @GeneratedValue
    var id: Long? = null,
    @CreatedDate
    val createdAt: LocalDateTime,
    var startTime: LocalDateTime,
    var endTime: LocalDateTime,
    var duration: Double?,
    var firstName: String,
    var lastName: String,
    var email: String,
    var parkMember: Boolean,
    var price: Double,
    var booked: Boolean,
    var paid: Boolean

    )