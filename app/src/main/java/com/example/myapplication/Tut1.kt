package com.example.myapplication

fun main() {

    fun printCakeTop(age: Int) {
        repeat(age + 2) {
            print("=")
        }
        println()
    }

    fun printCakeCandles(age: Int) {
        print(" ")
        repeat(age) {
            print(",")
        }
        println()

        print(" ")
        repeat(age) {
            print("|")
        }
        println()
    }

    fun printCakeBottom(age: Int, layers: Int) {
        repeat(layers){
            repeat(age + 2) {
                print("@")
            }
            println()
        }
    }

    val age = 24
    val layers = 5

    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)

}
