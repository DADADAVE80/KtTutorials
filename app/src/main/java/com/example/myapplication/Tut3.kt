package com.example.myapplication

fun main() {
    println(displayAlertMessage(emailId = "sae@gnv.com"))
    println()

    var operatingSystem = "Chrome OS"
    var eemailId = "sample@gmail.com"

    println(displayAlertMessage(emailId = eemailId))
    println()

    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(operatingSystem, firstUserEmailId))

}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String = "user@gmail.com"): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}