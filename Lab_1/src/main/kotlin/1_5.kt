package org.example

fun main() {
    println("Введите число:")
    val n = readlnOrNull()?.toIntOrNull()

    if (n != null) {
        val result = n + n * 2
        println("Результат: $result")
    } else {
        println("Некорректный ввод. Пожалуйста, введите число.")
    }
}
