package com.vmenon.mpo.api

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        val greeting = Greeting().greet()
        println("Greeting: $greeting")
        assertTrue(greeting.contains("Hello"), "Check 'Hello' is mentioned")
    }
}