package org.example

fun main() {
    val days = 2642

    val years = days / 365
    val remainingDaysAfterYears = days % 365
    val weeks = remainingDaysAfterYears / 7
    val remainingDays = remainingDaysAfterYears % 7

    println("Лет: $years, недель: $weeks, дней: $remainingDays")
}
