package org.example

fun main() {
    println("Введите элементы массива через запятую:")
    val input = readlnOrNull()

    if (!input.isNullOrEmpty()) {
        val array = input.split(", ").map { it.toInt() }.toIntArray()

        println("Исходный массив:")
        printArray(array)

        array.sort()

        println("Отсортированный массив по возрастанию:")
        printArray(array)
    } else {
        println("Введена пустая строка.")
    }
}

fun printArray(array: IntArray) {
    println(array.joinToString())
}
