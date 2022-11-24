package com.example.pilld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform