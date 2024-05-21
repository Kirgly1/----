package org.example

import kotlinx.coroutines.*

suspend fun <T> executeWithTimeout(action: suspend () -> T): T? {
    return withTimeoutOrNull(1000) {
        action()
    }
}

suspend fun longRunningTask() {
    delay(2000) // Имитация долгой операции
    println("Долгая операция выполнена")
}

suspend fun shortRunningTask() {
    delay(500) // Имитация короткой операции
    println("Короткая операция выполнена")
}

fun main() {
    val longExecutionResult = runBlocking {
        executeWithTimeout { longRunningTask() }
    }

    if (longExecutionResult == null) {
        println("Too long body execution")
    }

    val shortExecutionResult = runBlocking {
        executeWithTimeout { shortRunningTask() }
    }

    if (shortExecutionResult != null) {
        println("Результат короткой операции: $shortExecutionResult")
    } else {
        println("Too long body execution")
    }
}
