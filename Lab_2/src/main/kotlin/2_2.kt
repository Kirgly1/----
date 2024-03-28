package org.example

fun main() {
    println("Введите ваш возраст:")
    val age = readlnOrNull()?.toIntOrNull()

    if (age != null) {
        when {
            age > 18 -> println("Вам уже все можно")
            age == 18 -> println("Ура, Вам 18 лет!")
            else -> println("Вы еще слишком молоды")
        }
    } else {
        println("Ошибка ввода. Пожалуйста, введите корректный возраст.")
    }
}
