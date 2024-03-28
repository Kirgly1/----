package org.example

fun main() {
    println("Введите ваше имя:")
    val name = readlnOrNull()

    println("Введите ваш возраст:")
    val age = readlnOrNull()?.toIntOrNull()

    if (name != null && age != null) {
        println("Привет, $name! Тебе уже $age.")
    } else {
        println("Ошибка ввода. Пожалуйста, введите корректные данные.")
    }
}
