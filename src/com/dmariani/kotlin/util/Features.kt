package com.dmariani.kotlin.util

import com.dmariani.kotlin.music.MusicalInstrument
import com.dmariani.kotlin.person.Person

/**
 * This object provides Kotlin's feature examples
 * @author danielle.mariani
 */
object Features {

    /**
     * Strings Example
     */

    fun stringMultiline() {

        // Kotlin provides a new way to manage multiline strings

        val text = """
            |First Line
            |Second Line
            |Third Line
            """.trimMargin()

        println("$text")
    }

    /**
     * If Example
     */

    fun ifExpression(a: Int, b: Int): Int {

        var max = 0

        // If as a condition
        if (a > b) {
            max = a
        } else {
            max = b
        }

        // If as an expression
        // this is the ternary operator in Kotlin
        max = if (a > b) a else b

        return max
    }

    /**
     * When Expressions
     */

    fun whenExpression(data: Any) {

        // 'when' replaces the switch case statement
        // and it can be applied to multiple data types at once

        when(data) {
            is String -> println("I'm a String")
            is Int -> println("I'm a Int")
            is MusicalInstrument -> {
                println("I'm a musical instrument")

                // Kotlin provides Smart Cast, since the data is consider a Musical Instrument
                // we can manipulate that object as a Musical Instrument
                when(data.type) {
                    MusicalInstrument.Type.STRING -> println("I'm a String Instrument")
                    MusicalInstrument.Type.PERCUSSION -> println("I'm a Percussion Instrument")
                    MusicalInstrument.Type.WIND -> println("I'm a Wind Instrument")
                }
            }
            else -> println("Unsupported type")
        }

    }

    /**
     * When Expression #2
     */

    fun whenExpression2(instrument: MusicalInstrument) {

        // In addition, 'when' can be implemented as expression to return data

        val message = when(instrument.type) {
            MusicalInstrument.Type.WIND -> "Checking wind instrument"
            MusicalInstrument.Type.STRING -> "Checking string instrument"
            MusicalInstrument.Type.PERCUSSION -> "Checking percussion percussion"
        }

        println("Message: $message")
    }

    /**
     * Range Expression
     */

    fun loops() {

        val text = "text"
        for (i in 0 until text.length) {

        }

        // Increase Example: This will print numbers from 1 to 10
        print("Increase Range:")
        for (i in 1..10) {
            print("Number $i")
        }

        // Decrease Example: This will NOT print any number
        println()
        println("Decrease Range")
        for (i in 10..1) {
            print("Number $i")
        }

        // DownTo Example: This will print numbers from 10 to 1
        println()
        println("DownTo Range Example:")
        for (i in 10 downTo 1) {
            print("Number $i")
        }

        // Until Example: This will print numbers from 1 to 9 (limit - 1)
        println()
        println("Until Range Example:")
        for (i in 1 until 10) {
            print("Number $i")
        }

        // Step Example: This will print numbers odd numbers form 1 to 10
        println()
        println("Step Range Example:")
        // step must not be equal to 1
        for (i in 1..10 step 2) {
            print("Number $i")
        }

        // Step Example: This will print numbers event numbers form 10 to 1
        println()
        println("Step Range Example 2:")
        // step must not be equal to 1
        for (i in 10 downTo  1 step 2) {
            print("Number $i")
        }
    }

    fun loop2() {
        println("While Example:")

        var number = 10
        while (number > 0) {
            print("Number Range:")
            number--
        }

        println()
        println("Do While Example:")

        do {
            val data = Person() // retrieveData()
        } while (data != null) // data object is visible here
        println("Do While finished")
    }

    /**
     * Maps
     */

    fun traverseMap() {

        // create a map with empty constructor
        val map = hashMapOf<String, Person>()
        map.put("P1", Person("Pepe", "M"))
        map.put("P2", Person("Mary", "L"))
        map.put("P3", Person("Luis", "M"))

        // create a map passing objects in the constructor
        val map2 = mapOf("P1" to Person("Pepe", "M"),
                "P2" to Person("Mary", "L"),
                "P3" to Person("Luis", "M"))

        // loop through map items using destructuring expression
        println("Check People Map Items using Destruturing Expression")
        for ((personId, person) in map) {
            println("Person id $personId - data -> $person")
        }

        // loop through map items using For Each and Lambda Expression
        println("ForEach with Lambda #1")
        map.forEach { key, value ->
            println("Person id $key - data -> $value")
        }

        // loop through map items using Entries For Each and Lambda Expression
        println("ForEach with Lambda #2")
        map.entries.forEach {
            println("Person id ${it.key} - data -> ${it.value}")
        }

    }

    /**
     * Collections
     */

    fun sortedList() {

        // create a list of people
        val people = listOf(Person("Pepe", "M"),
                Person("Mary", "L"),
                Person("Luis", "M"))


        // sort a list of people by First Name
        println("ForEach sorted list")
        val sorted = people.sortedBy { it.firstName }

        // loop through list items using For Each and Lambda Expression
        sorted.forEach {
            println("$it")
        }
    }

    fun groupedList() {
        // create a list of people
        val people = listOf(Person("Pepe", "M"),
                Person("Mary", "L"),
                Person("Luis", "M"))

        // group a list of people by the initial letter of each Last Name
        // the output will be a map in which the key will be the initial
        // letter of each Last Name and the value will be a list of
        // people that matches that initial letter
        println("GroupBy list")
        val groups = people.groupBy { it.lastName[0] }

        // loop through result map items after grouping the people
        // using For Each and Lambda Expression
        groups.entries.forEach {
            println("${it.key} - Data -> ${it.value}")
        }
    }

}