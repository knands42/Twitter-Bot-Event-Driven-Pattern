package com.example.eventdriven.domain.exception

class TwitterEventException : RuntimeException {
    constructor(): super()

    constructor(message: String): super(message)

    constructor(message: String, cause: Throwable): super(message, cause)
}