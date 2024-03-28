package org.example

fun main() {
    println("Введите элементы массива через запятую:")
    val input = readlnOrNull()

    if (!input.isNullOrEmpty()) {
        val array = input.split(", ").map { it.toInt() }.toIntArray()

        val average = array.average()
        println("Среднее арифметическое: $average")

        println("Элементы массива, большие среднего арифметического:")
        for (element in array) {
            if (element > average) {
                println(element)
            }
        }
    } else {
        println("Введена пустая строка.")
    }
}
