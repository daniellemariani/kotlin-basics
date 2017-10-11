package com.dmariani.kotlin.person

import com.dmariani.kotlin.util.WHITESPACE_CHAR

/**
 * This class represents a Person model class in Kotlin.
 *
 * Data class are designed to represent models and define them
 * in a simple way. The fields of the class must be declared in the
 * constructor
 *
 * It is possible to inherit a data class from a non-data class,
 * but inheriting a data class from another data class is not allowed
 *
 * @author danielle.mariani
 */
data class Person(
        var firstName: String = DEFAULT_FIRST_NAME,
        var lastName: String = DEFAULT_LAST_NAME,
        var age: Int = DEFAULT_AGE) {

    companion object {
        // constants
        private const val DEFAULT_FIRST_NAME: String = "Danielle"
        private const val DEFAULT_LAST_NAME = "Mariani"
        private const val DEFAULT_AGE = 28
    }

    fun foo() {
        // do something
        println("Person foo")
    }

    fun bar() : String? {
        // do something
        println("Person bar")
        return null
    }

    // Body Expression Functions

    fun fullName() : String = firstName + String.WHITESPACE_CHAR + lastName

    fun isAdult() = age >= 18

    fun futureAge(years: Int = 1) : Int = age + years

}