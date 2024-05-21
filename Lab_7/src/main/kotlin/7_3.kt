package org.example

import kotlinx.coroutines.*
import kotlin.random.Random
import kotlin.system.measureTimeMillis

suspend fun simpleTask(coroutineIndex: Int): Pair<Int, Boolean> {
    val randomNumber = Random.nextInt(1000)
    val isEven = randomNumber % 2 == 0
    return coroutineIndex to isEven
}

fun main() {
    val numberOfCoroutines = 100_000
    val results = mutableMapOf<Int, Boolean>()

    println("Запуск $numberOfCoroutines корутин...")

    val totalTime = measureTimeMillis {
        runBlocking {
            repeat(numberOfCoroutines) { index ->
                val result = async { simpleTask(index) }
                results[result.await().first] = result.await().second
            }
        }
    }
    val successfulTasks = results.count { it.value }

    println("Успешно выполнено $successfulTasks задач из $numberOfCoroutines.")
    println("Общее время выполнения всех корутин: $totalTime миллисекунд.")
}
