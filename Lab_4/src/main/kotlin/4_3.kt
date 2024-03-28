package org.example

fun main() {
    println("Введите элементы массива через запятую:")
    val input = readlnOrNull()

    if (!input.isNullOrEmpty()) {
        val array = input.split(", ").map { it.toInt() }

        if (array.isNotEmpty()) {
            println("Минимальный элемент: ${array.minOrNull()}")
            println("Максимальный элемент: ${array.maxOrNull()}")
        } else {
            println("Массив пуст.")
        }
    } else {
        println("Введена пустая строка.")
    }
}
