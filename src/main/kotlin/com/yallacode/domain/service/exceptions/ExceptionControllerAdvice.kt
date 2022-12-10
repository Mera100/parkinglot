package com.yallacode.domain.service.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionControllerAdvice {

    @ExceptionHandler
    fun handleIllegalStateException(ex: RuntimeException): ResponseEntity<String> {

        return ResponseEntity(ex.message, HttpStatus.BAD_REQUEST)
    }
}