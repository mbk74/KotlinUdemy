package com.example.samplemultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform