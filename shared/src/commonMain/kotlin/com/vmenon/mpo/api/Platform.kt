package com.vmenon.mpo.api

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform