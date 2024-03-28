package org.example

fun main() {
    println("Введите произвольное число:")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null && number > 0) {
        val divisors = findDivisors(number)
        println("Делители числа $number без остатка: ${divisors.joinToString()}")
    } else {
        println("Ошибка ввода. Пожалуйста, введите положительное число.")
    }
}

fun findDivisors(number: Int): List<Int> {
    val divisors = mutableListOf<Int>()

    for (i in 1..number) {
        if (number % i == 0) {
            divisors.add(i)
        }
    }

    return divisors
}
