package org.example

fun main() {
    val num1 = 5
    val num2 = 8

    val minNumber = minOf(num1, num2)
    val maxNumber = maxOf(num1, num2)

    println("Введенные числа: $num1 и $num2")
    println("Массив: ${createArray(minNumber, maxNumber).joinToString()}")
}

fun createArray(min: Int, max: Int): IntArray {
    val arraySize = max - min + 1
    val resultArray = IntArray(arraySize) { min + it }
    return resultArray
}
