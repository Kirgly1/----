package org.example

fun main() {
    println("Введите сумму экспорта:")
    val export = readlnOrNull()?.toDoubleOrNull() ?: return

    println("Введите сумму импорта:")
    val import = readlnOrNull()?.toDoubleOrNull() ?: return

    val balance = export - import

    if (balance > 0) {
        val profit = balance
        println("Прибыль: $profit")
    } else if (balance < 0) {
        val loss = -balance
        println("Убытки: $loss")
    } else {
        println("Сальдо баланса нулевое. Нет прибыли и убытков.")
    }
}
