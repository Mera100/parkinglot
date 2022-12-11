package com.yallacode.domain.service.exceptions

import org.springframework.http.HttpStatus

class SlotAlreadyFreeException : RuntimeException() {

    override val message: String?
        get() = "The slot is already released"

    val responseCode : HttpStatus?
        get() = HttpStatus.NOT_ACCEPTABLE
}
