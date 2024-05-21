package org.example

fun applyFunction(number: Int, function: (Int) -> Int): Int {
    return function(number)
}

fun createMultiplier(multiplier: Int): (Int) -> Int {
    return { number -> number * multiplier }
}

fun main() {
    val result1 = applyFunction(20) { it * 2 }
    println("result: $result1")

    val multiplierBy4 = createMultiplier(4)
    val result2 = multiplierBy4(5)
    println("result: $result2")
}