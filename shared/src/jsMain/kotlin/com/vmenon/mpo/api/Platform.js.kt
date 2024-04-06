package com.vmenon.mpo.api

class JsPlatform : Platform {
    override val name: String = "Js Version"
}

actual fun getPlatform(): Platform = JsPlatform()