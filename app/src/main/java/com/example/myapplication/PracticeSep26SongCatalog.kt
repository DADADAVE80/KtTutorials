package com.example.myapplication

class Song(
    val title: String,
    val artist: String,
    val yearPublished: String,
    val playCount: Int
) {
    fun printSongDescription() {
        println("$title, performed by $artist, was released $yearPublished")
    }

    fun checkSongPopularity() {
        if (playCount > 1000) {
            println("It's a popular song")
        } else {
            println("It's an unpopular song")
        }
    }
}

fun main() {
    val song = Song("\"You're On\"","Madeon","2015", 2000)

    song.printSongDescription()
    song.checkSongPopularity()
}