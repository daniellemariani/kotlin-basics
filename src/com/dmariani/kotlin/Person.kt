package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
class Person() {

    // properties
    var firstName: String? = null
    var lastName: String? = null
    var age: Int? = null

    init {
        firstName = DEFAULT_FIRST_NAME
        lastName = DEFAULT_LAST_NAME
        age = DEFAULT_AGE
    }

    constructor(firstName: String, lastName: String, age: Int) : this() {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    companion object {

        // constants
        private val DEFAULT_FIRST_NAME: String = "Danielle"
        private val DEFAULT_LAST_NAME = "Mariani"
        private val DEFAULT_AGE = 28
    }
}