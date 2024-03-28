package org.example

fun main() {
    println("Введите три числа:")
    val num1 = readlnOrNull()?.toDoubleOrNull()
    val num2 = readlnOrNull()?.toDoubleOrNull()
    val num3 = readlnOrNull()?.toDoubleOrNull()

    if (num1 != null && num2 != null && num3 != null) {
        val average = findAverage(num1, num2, num3)
        println("Среднее число: $average")
    } else {
        println("Ошибка ввода. Пожалуйста, введите корректные числа.")
    }
}

fun findAverage(num1: Double, num2: Double, num3: Double): Double {
    return when {
        num1 == num2 && num2 == num3 -> {
            println("Ошибка")
            Double.NaN
        }
        num1 == num2 || num1 == num3 -> num1
        num2 == num3 -> num2
        else -> (num1 + num2 + num3) / 3
    }
}
