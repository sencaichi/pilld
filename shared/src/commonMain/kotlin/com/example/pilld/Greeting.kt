package com.example.pilld

import com.kizitonwose.calendar.compose.*

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name}!"
    }
}