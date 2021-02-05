package com.example.week1.exercises

class Card(private val company: String,
           val ownerName: String,
           val number: String,
           val expirationDate: String,
           val csv: Int,
           var balance: Double,
           val type: CardType,
           var accessLimit: Int,
           val reward: Double
) {

    fun isDebitCardFunctional(): Boolean {
        return type == CardType.DEBIT && balance > 0
    }

    fun isCreditCardStillAccessible(): Boolean {
        return type == CardType.CREDIT && accessLimit > 0
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun pay(amount: Double) {
        if (type == CardType.CREDIT) {
            if (balance >= amount && accessLimit > 0) {
                balance -= amount * reward
                accessLimit--
                println("Successful transaction! Your current balance is $balance and you can still access your account for $accessLimit times")
            } else {
                println("Transaction failed! Your current balance is $balance and you can still access your account for $accessLimit times!")
            }
        } else if (balance >= amount) {
            balance -= amount
            println("Successful transaction! Your current balance is $balance")
        } else {
            println("Transaction failed! Insufficient funds!")
        }
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Successful transaction!Your current balance is $balance")
        } else {
            println("Transaction failed! Insufficient funds!")
        }
    }

}