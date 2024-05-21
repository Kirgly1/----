package org.example

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun calculateFactorial(number: Int): Long {
    return if (number == 0) {
        1
    } else {
        delay(1000)
        number.toLong() * calculateFactorial(number - 1)
    }
}

fun main() {
    val number = 6
    println("Вычисление факториала числа $number начато.")

    val time = measureTimeMillis {
        runBlocking {
            val result = calculateFactorial(number)
            println("Факториал числа $number равен $result.")
        }
    }

    println("Вычисление факториала числа $number завершено за $time миллисекунд.")
}
