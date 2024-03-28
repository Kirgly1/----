package org.example

fun main() {
    println("Введите число:")
    val input = readlnOrNull()

    if (!input.isNullOrEmpty() && input.all { it.isDigit() }) {
        val (evenCount, oddCount) = countEvenOddDigits(input.toInt())
        println("Количество четных цифр: $evenCount")
        println("Количество нечетных цифр: $oddCount")
    } else {
        println("Ошибка: Введено некорректное число.")
    }
}

fun countEvenOddDigits(number: Int): Pair<Int, Int> {
    var evenCount = 0
    var oddCount = 0

    for (digit in number.toString().map { it.toString().toInt() }) {
        if (digit % 2 == 0) {
            evenCount++
        } else {
            oddCount++
        }
    }

    return Pair(evenCount, oddCount)
}
