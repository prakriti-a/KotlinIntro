package com.prakriti.kotlinintro

fun loopPractice() {
    // for (i in 1 until 10) // -> doesn't include ending value
    // for (i in 10 downTo 0) // includes both

    for (i in 5..100 step 5) { // includes both values
        // loop in 3 so lesser unnecessary iterations, or loop in 5
        if(i%3==0) { // check other number here
            println(i)
        }
    }
}