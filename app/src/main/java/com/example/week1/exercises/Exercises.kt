package com.example.week1.exercises

fun main() {

    //EX1
    fun computeBloodPressureCategory(systolic: Int, diastolic: Int) {
        when {
            systolic < 120 && diastolic < 80 -> println("NORMAL")
            (systolic in 120..129) && diastolic < 80 -> println("ELEVATED")
            (systolic in 130..139) || (diastolic in 80..89) -> println("HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 1")
            (systolic in 140..179) || (diastolic in 90..119) -> println("HIGH BLOOD PRESSURE (HYPERTENSION) STAGE 2")
            systolic >= 180 -> println("HYPERTENSIVE CRISIS(consult your doctor immediately)")
            diastolic >= 120 -> println("HYPERTENSIVE CRISIS(consult your doctor immediately)")
            systolic >= 180 && diastolic >= 120 -> println("HYPERTENSIVE CRISIS(consult your doctor immediately)")
        }
    }

    //EX3
    fun findFactorial(number: Int): Int {
        return if (number > 1) number * findFactorial(number - 1) else 1
    }

    computeBloodPressureCategory(140, 123)
    println(findFactorial(4))

    //EX2
    val alexandraDebitCard = Card("BT", "Alexandra Dediu", "123445567", "09/23", 546, 1234.8, CardType.DEBIT, 0, 0.15)
    alexandraDebitCard.deposit(100.0)
    println(alexandraDebitCard.balance)
    println(alexandraDebitCard.isDebitCardFunctional())
    alexandraDebitCard.withdraw(50.0)
    alexandraDebitCard.pay(20.0)

    val alexandraCreditCard = Card("BT", "Alexandra Dediu", "123445567", "11/23", 535, 1234.8, CardType.CREDIT, 2, 0.15)
    alexandraCreditCard.pay(100.0)
    alexandraCreditCard.pay(50.0)
    alexandraCreditCard.pay(50.0)
    println(alexandraCreditCard.isCreditCardStillAccessible())

}