package com.dmariani.kotlin.util

/**
 * @author danielle.mariani
 */
object Feature {

    fun multiline() {

        val text = """
|First Line
|Second Line
|Third Line
"""

        println(text)
    }

    fun ifExpression(a: Int, b: Int) {

        var max = 0

        if (a > b) {
            max = a
        } else {
            max = b
        }

        max = if (a > b) a else b

    }

    fun whenExpression(data: Any) {

        when(data) {
            is String -> println("I'm a String")
            is Int -> println("I'm an Int")
            else -> println("Not sure what I am")
        }
    }

    fun rangeExpression() {

        print("Increase: ")
        for (number in 1..10) {
            print("$number, ")
        }

        println()
        print("Decrease: ")

        for (number in 10..1) {
            print("$number, ")
        }

        println()
        print("Decrease 2: ")

        for (number in 10 downTo 1) {
            print("$number, ")
        }

        println()
        print("Step: ")

        for (number in 1..10 step 2) {
            print("$number, ")
        }
    }

    fun traverseMap() {

    }

    /**
     * Collections
     */

    fun sortedList() {

    }

    fun groupedList() {

    }

}