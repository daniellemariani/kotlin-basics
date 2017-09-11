package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
data class Person(
        var firstName: String? = DEFAULT_FIRST_NAME,
        var lastName: String? = DEFAULT_LAST_NAME,
        var age: Int? = DEFAULT_AGE) {

    companion object {

        // constants
        private val DEFAULT_FIRST_NAME: String = "Danielle"
        private val DEFAULT_LAST_NAME = "Mariani"
        private val DEFAULT_AGE = 28
    }
}