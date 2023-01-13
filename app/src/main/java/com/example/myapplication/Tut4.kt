package com.example.myapplication

fun main() {
    var aCity = "Ankara"
    var aLowTemp = 27
    var aHighTemp = 31
    var aCoR = 82
    cityWeather(aCity, aLowTemp, aHighTemp, aCoR)

    var bCity = "Tokyo"
    var bLowTemp = 32
    var bHighTemp = 36
    var bCoR = 10
    cityWeather(bCity, bLowTemp, bHighTemp, bCoR)
}

fun cityWeather(city: String, lowTemperature: Int, highTemperature: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low Temperature: $lowTemperature, High Temperature: $highTemperature")
    println("Chance of rain: $chanceOfRain%")
    println()
}
