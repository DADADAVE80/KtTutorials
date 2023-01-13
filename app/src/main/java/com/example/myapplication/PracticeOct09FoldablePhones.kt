package com.example.myapplication

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    open fun switchOff() {
        isScreenLightOn = false
    }

    open fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isPhoneFolded: Boolean = true) :
    Phone() {

    override fun switchOn() {
        isScreenLightOn = true
    }

    override fun switchOff() {
        isScreenLightOn = false
    }

    fun foldPhone() {
        isPhoneFolded = true
    }

    fun unfoldPhone() {
        isPhoneFolded = false
    }

    override fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) {
            if (isPhoneFolded) "on but the larger screen is off" else "on"
        } else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

fun main() {

    val foldablePhone = FoldablePhone()

    foldablePhone.switchOn()
    foldablePhone.foldPhone()
    foldablePhone.checkPhoneScreenLight()
    foldablePhone.unfoldPhone()
    foldablePhone.checkPhoneScreenLight()
}

