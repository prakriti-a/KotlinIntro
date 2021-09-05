package com.prakriti.kotlinintro

import java.util.ArrayList

class Player(val name:String, var level:Int = 1, var score: Int = 0) { // primary constructor
    // default parameters to be listed after non-default parameters in a constructor
    // name is constant, level can be specified in constructor but also has default value
    var lives = 3
//    var score = 0
//    var level = 1 // no duplicate declarations

    var weapon:Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    fun show() {
//        println("""
//            Name: $name
//            Lives: $lives
//            Level: $level
//            Score: $score
//            Weapon: ${weapon.name}
//            Damage: ${weapon.damageInflicted}
//        """.trimIndent())
        if(lives>0) {
            println("$name is alive")
        } else {
            println("$name is dead")
        }
    }

    // default string rep
    override fun toString(): String {
        return """
            Name: $name
            Lives: $lives
            Level: $level
            Score: $score
            $weapon
        """.trimIndent()
//        Weapon: ${weapon.name}
//        Damage: ${weapon.damageInflicted}
        // use overridden toString instead of printing each var
    }

    fun addLootItem(item: Loot) {
        if(item != null) {
            inventory.add(item)
        }
        // here, put code to save inventory / persistent data
    }

    fun removeLootItem(item: Loot): Boolean {
        return if (inventory.contains(item)) {
            inventory.remove(item)
            true
        } else {
            false
        }
    }

    fun removeLootItem(lootName: String): Boolean { // edit
        /*
        for(item in inventory) {
            if(item.name == name) {
                println("$name is removed from $name's Loot")
                inventory.remove(item)
                return true
            }
        }
        return false */
//        println("$lootName is removed from $name's Loot")
//        return inventory.removeIf { it.name == lootName } // loops over items // API 24+
        for(item in inventory) {
            if(item.name == lootName) {
                println("$lootName will be dropped from your loot")
                inventory.remove(item)
                return true // break out once a single item of the passed name is removed
            }
        }
        println("You don't have this item in your loot")
        return false
    }

    fun showInventory() {
        var score = 0.0
        println("$name's Inventory: ")
        for (item in inventory) { // for each loop
            println(item) // runs toString here
            score += item.value
        }
        println("============================================")
        println("The loot is worth $score totally")
    }
}