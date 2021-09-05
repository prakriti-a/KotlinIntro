package com.prakriti.kotlinintro

fun main(args: Array<String>) { // for inheritance codes
    /*
    by default, kotlin classes cannot be extended
        (i.e. similar to marking Java classes final, by default)
     mark classes as open to allow extending them
     */

//    val enemy = Enemy("test", 10, 3)
    //    enemy.takeDamage(3)
//    println(enemy)
//    enemy.takeDamage(11)
//    println(enemy)
    // ------------ create an enemy object-----------------

    println("========================================================")
    val uglyTroll = Troll("Ugly Troll") // constructor only needs name
    println(uglyTroll) // Enemy super class method is called
    uglyTroll.takeDamage(12)
    println(uglyTroll)
    uglyTroll.takeDamage(20)
    println(uglyTroll)

    println("========================================================")
    val vlad = Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(11)
    println(vlad)

    println("========================================================")
    val dracula = VampireKing("Dracula")
    println(dracula)
    dracula.takeDamage(16)
    println(dracula)

    // while loop
    while (dracula.lives > 0) {
        if(dracula.dodgeHit()) { // random output
            continue
        }
        if(dracula.runAway()) {
            println("${dracula.name} has escaped!")
            break
        } else {
            dracula.takeDamage(16)
        }
    }
    println(dracula)

}