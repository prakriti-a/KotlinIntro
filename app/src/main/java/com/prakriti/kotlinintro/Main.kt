package com.prakriti.kotlinintro
// in Kotlin, everything is public by default

fun main(args: Array<String>) {
    // instantiate Player class

    val jake = Player("Jake")
//    println(jake.name)
//    println(jake.weapon.name)
//    println(jake.weapon.damageInflicted)
    // change properties
    jake.weapon = Weapon("Gun", 35)
    jake.show()

    jake.addLootItem((Loot("Ring Of Protection", LootType.RING, 21.5)))
    jake.addLootItem((Loot("Invisibility Potion", LootType.POTION, 34.75)))
    // the above items have no reference to them so drop them by using overloaded removeLoot function
    jake.showInventory()

    println("========================================================")

    val rosa = Player("Rosa", 5, 500)
//    rosa.level = 5 -> can put in instantiation line
    var axe = Weapon("Axe", 12)
    rosa.weapon = axe
    println(rosa.weapon.name)
    println(axe.name)
    // since both vars refer to the same object...
    axe.damageInflicted = 20
    println(axe.damageInflicted)
    println(rosa.weapon.damageInflicted)

    rosa.show()
    println(rosa) // same as rosa.toString

    println("========================================================")

    val amy = Player("Amy", 4, 350)
    amy.weapon = Weapon("Sword", 10)
    println(amy)
    val redPotion = Loot("Red Potion", LootType.POTION, 8.50)
 //   amy.addLootItem(redPotion)
//    amy.showInventory()
    // add & print multiple loot items
    val dragonSkullHelmet = Loot("Dragon Skull Helmet", LootType.ARMOUR, 17.5)
    amy.addLootItem(dragonSkullHelmet)
//    amy.showInventory()
    println("-----------")
    if(amy.removeLootItem(redPotion)) {
        amy.showInventory()
    } else {
        println("The ${redPotion.name} doesn't exist in ${amy.name}'s Inventory") // refactor to put in Player class
    }

    amy.addLootItem(redPotion)
    amy.showInventory()
    amy.removeLootItem("Red Potion") // using overloaded fn // put if-else block here
    amy.showInventory()

    println("========================================================")
    // loop to add up player score
    val terry = Player("Terry", 7, 760)

    terry.addLootItem(Loot("Chest Armour", LootType.ARMOUR, 27.0))
    terry.addLootItem(Loot("Gold Ring", LootType.RING, 13.7))
    terry.addLootItem(Loot("Cursed Potion", LootType.POTION, -8.0))
    terry.addLootItem(Loot("Shield Of Midnight", LootType.ARMOUR, 21.0))
    terry.showInventory()

    terry.addLootItem(Loot("Gold Ring", LootType.RING, 13.7))
    terry.addLootItem(Loot("Gold Ring", LootType.RING, 13.7))
    terry.showInventory()

    println("---------------------")
    terry.removeLootItem("Gold Ring")
    terry.showInventory()

    println("---------------------")
    terry.removeLootItem("Fake item")
//        println("This item is not present in your loot")

}
