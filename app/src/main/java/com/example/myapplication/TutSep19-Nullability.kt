package com.example.myapplication

fun main() {
    var favoriteActor: String? = null

    val lengthOfActorName = favoriteActor?.length ?: 0

    println("The length of my favorite Actor's name is $lengthOfActorName")
}