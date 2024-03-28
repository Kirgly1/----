package org.example

fun main() {
    val secretNumber = (1..9).random()

    println("Угадайте число от 1 до 9:")

    var guessed = false

    while (!guessed) {
        val guess = readlnOrNull()?.toIntOrNull()

        if (guess == null || guess !in 1..9) {
            println("Пожалуйста, введите корректное число от 1 до 9.")
            continue
        }

        if (guess == secretNumber) {
            println("Поздравляем! Вы угадали число $secretNumber!")
            guessed = true
        } else {
            println("Неправильно. Попробуй еще раз:")
        }
    }
}
