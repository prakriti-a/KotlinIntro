package com.prakriti.kotlinintro

open class Vampire(name: String) : Enemy(name, 25, 3) { // passing fixed default values for all Vampire objects
    // these default values thus are not allowed to be altered by a subclass

    // unique properties of Vampire class -> override takeDamage() fn
    // methods must also be declared open
    // in Kotlin, all classes implicitly extend Any class (similar to Object class in java)
    override fun takeDamage(damage: Int) {
        super.takeDamage(damage/2) // call method from super class
    }
}