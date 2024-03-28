package org.example

fun main() {
    val number1 = 2
    val number2 = 6

    println("У вас есть числа: $number1 и $number2")
    println("1. Добавить")
    println("2. Отнять")
    println("0. Ничего")

    println("Выберите действие:")
    val choice = readlnOrNull()?.toIntOrNull()

    when (choice) {
        1 -> println("Результат сложения: ${number1 + number2}")
        2 -> println("Результат вычитания: ${number1 - number2}")
        0 -> println("Ничего не произошло")
        else -> println("Некорректный выбор")
    }
}
