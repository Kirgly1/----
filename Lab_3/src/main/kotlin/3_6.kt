package org.example

fun main() {
    var sum = 0
    var number = 5

    while (number <= 57) {
        if (number != 34 && number != 46 && number != 52) {
            sum += number
        }
        number++
    }

    println("Сумма всех чисел от 5 до 57, исключая 34, 46 и 52: $sum")
}
