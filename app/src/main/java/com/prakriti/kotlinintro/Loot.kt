package com.prakriti.kotlinintro

enum class LootType { // storing multiple choices
    POTION, RING, ARMOUR
}

class Loot(val name: String, val type: LootType, val value: Double) {

    override fun toString(): String {
        return "-> $name is a $type worth $value"
    }
}