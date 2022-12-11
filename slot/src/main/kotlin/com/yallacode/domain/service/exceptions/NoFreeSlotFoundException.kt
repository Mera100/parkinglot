package com.yallacode.domain.service.exceptions

import org.springframework.http.HttpStatus

class NoFreeSlotFoundException : RuntimeException() {
    override val message: String?
        get() = "No free slot found"
        val resposeCode : HttpStatus = HttpStatus.NOT_FOUND
}
