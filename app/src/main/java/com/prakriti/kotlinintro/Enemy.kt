package com.prakriti.kotlinintro

open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {
    // super class

    // by default functions cannot be overridden in kotlin
    open fun takeDamage(damage: Int) {
        var remHitPoints = hitPoints - damage
        if(remHitPoints > 0) {
            hitPoints = remHitPoints
            println("$name took $damage points of damage and has $hitPoints points left")
        } else {
            lives -= 1
            if(lives > 0) {
                println("$name has lost a life! $lives left!") // hitpoints is not reset to initial value here
            } else {
                println("No lives left, $name is dead!")
                hitPoints = 0 // as its dead
            }
        }
    }

    override fun toString(): String {
        return "Name: $name, Hit Points: $hitPoints, Lives: $lives"
        // """.trimMargin()
    }
}