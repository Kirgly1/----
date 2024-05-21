package org.example

import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    runBlocking {
        while (true) {
            delay(1000)
            val currentTime = getCurrentTime()
            println("Current time: $currentTime")
        }
    }
}

fun getCurrentTime(): String {
    val sdf = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
    return sdf.format(Date())
}
