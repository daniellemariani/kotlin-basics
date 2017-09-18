package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
data class Person(
        var firstName: String = DEFAULT_FIRST_NAME,
        var lastName: String = DEFAULT_LAST_NAME,
        var age: Int = DEFAULT_AGE) {

    fun foo() {
        // do something
        println("Person foo")
        println("Method called: ${String.timestamp()}")
    }

    fun bar() : String? {
        // do something
        println("Person bar")
        return null
    }

    fun fullName() : String = firstName.toUpperCase() + String.WHITESPACE_CHAR + lastName.toUpperCase()

    fun fullNameLength() : Int = (firstName + lastName).length

    fun futureAge(years: Int = 1) : Int = age + years

    companion object {

        // constants
        private val DEFAULT_FIRST_NAME: String = "Danielle"
        private val DEFAULT_LAST_NAME = "Mariani"
        private val DEFAULT_AGE = 28
    }
}