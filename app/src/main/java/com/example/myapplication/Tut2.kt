package com.example.myapplication

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber,secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    val subResult = subtract(firstNumber,secondNumber)
    val anotherSubResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("$firstNumber - $secondNumber = $subResult")
    println("$firstNumber - $thirdNumber = $anotherSubResult")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}
