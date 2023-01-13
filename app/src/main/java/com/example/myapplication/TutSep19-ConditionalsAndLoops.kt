package com.example.myapplication

fun main() {
    val x: Any = 'v'

    when (x) {
        2,3,5,7 -> println("x is a prime number between 1 to 10")
        1..10 -> println("x is not a prime number")
        is Int -> println("x is an Integer, but not between 1 to 10")
        else -> println("x is not an Integer")
    }

    val trafficLightColor = "Green"
    val message = when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid Traffic light color"
    }

    println(message)
}