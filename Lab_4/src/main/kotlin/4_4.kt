package org.example

fun main() {
    println("Введите элементы массива через запятую:")
    val input = readlnOrNull()

    if (!input.isNullOrEmpty()) {
        val array = input.split(", ").map { it.toInt() }

        if (array.size >= 2) {
            val secondSmallest = findSecondSmallest(array)
            println("Второй самый маленький элемент в массиве: $secondSmallest")
        } else {
            println("Массив должен содержать как минимум два элемента.")
        }
    } else {
        println("Введена пустая строка.")
    }
}

fun findSecondSmallest(array: List<Int>): Int {
    val sortedArray = array.sorted()
    return sortedArray[1]
}
