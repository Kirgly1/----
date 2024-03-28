package org.example

fun main() {
    var sum = 0

    for (i in 1..100) {
        if (i % 4 == 0) {
            sum += i
        }
    }

    println("Сумма чисел от 1 до 100, кратных 4: $sum")
}
