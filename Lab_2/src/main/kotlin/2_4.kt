package org.example

fun main() {
    println("Введите число от 1 до 7:")
    val day = readlnOrNull()?.toIntOrNull()

    if (day != null) {
        val dayOfWeek = when (day) {
            1 -> "Понедельник"
            2 -> "Вторник"
            3 -> "Среда"
            4 -> "Четверг"
            5 -> "Пятница"
            6 -> "Суббота"
            7 -> "Воскресенье"
            else -> "В неделе 7 дней ._."
        }
        println(dayOfWeek)
    } else {
        println("Ошибка ввода. Пожалуйста, введите число от 1 до 7.")
    }
}
