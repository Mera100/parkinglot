package com.yallacode.domain.service.exceptions

class SlotNotFoundException : RuntimeException() {

    override val message: String?
        get() = "The slot was not found"
}
