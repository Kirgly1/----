package org.example

fun main() {
    println("Введите число с четырьмя цифрами:")
    val input = readlnOrNull()

    if (input != null && input.length == 4 && input.all { it.isDigit() }) {
        val number = input.toInt()
        val number1 = number / 1000
        val number2 = (number % 1000) / 100
        val number3 = (number % 100) / 10
        val number4 = number % 10

        println("Результат: $number1, $number2, $number3, $number4")
    } else {
        println("Пожалуйста, введите число с четырьмя цифрами.")
    }
}
