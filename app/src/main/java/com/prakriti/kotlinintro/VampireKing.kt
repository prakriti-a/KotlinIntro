package com.prakriti.kotlinintro

import java.util.*

class VampireKing(name: String) : Vampire(name) {
    // change default hitPoints value

    init { // executed auto when object is created
        hitPoints = 120
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2) // overall, been divided by 4 now
    }

    fun runAway(): Boolean {
        return lives < 2
    }

    // to demo use of 'continue'
    fun dodgeHit(): Boolean {
        val random = Random()
        val chance = random.nextInt(6) // emulate a dice throw (b/w 0 and 5)
        if(chance > 3) {
            println("$name dodged the hit")
            return true
        }
        return false
    }

}