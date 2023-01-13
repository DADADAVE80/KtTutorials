package com.example.myapplication

fun main() {
    val celsiusTemperature: Double = 27.0
    val kelvinTemperature: Double = 350.0
    val fahrenheitTemperature: Double = 10.0

    //Formulas
    val celsiusToFahrenheit = (9 * celsiusTemperature) / 5 + 32.0
    val kelvinToCelsius = kelvinTemperature - 273.15
    val fahrenheitToKelvin = (5) * (fahrenheitTemperature - 32) / 9 + 273.15

    printFinalTemperature(
        celsiusTemperature,
        "Celsius",
        "Fahrenheit",
        celsiusToFahrenheit
    )

    printFinalTemperature(
        kelvinTemperature,
        "Kelvin",
        "Celsius",
        kelvinToCelsius
    )

    printFinalTemperature(
        fahrenheitTemperature,
        "Fahrenheit",
        "Kelvin",
        fahrenheitToKelvin
    )
}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula)
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}