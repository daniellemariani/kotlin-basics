package com.dmariani.kotlin

import java.text.SimpleDateFormat
import java.util.*

/**
 * @author danielle.mariani
 */


/**
 * String Extension function to get timestamp from Date object
 */
fun String.Companion.timestamp(date: Date = Date()): String = SimpleDateFormat("E MMM dd, yyyy hh:mm:ss a").format(date)

val String.Companion.WHITESPACE_CHAR: String
    get() = " "

val String.middleLength: Int
    get() = length / 2