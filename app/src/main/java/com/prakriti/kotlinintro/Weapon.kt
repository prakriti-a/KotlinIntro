package com.prakriti.kotlinintro

class Weapon(val name:String, var damageInflicted:Int) {

    override fun toString(): String {
        return """
            Weapon: $name
            Damage: $damageInflicted
        """.trimIndent()
    }
}