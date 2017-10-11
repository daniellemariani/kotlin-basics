package com.dmariani.kotlin.util

import java.text.SimpleDateFormat
import java.util.*

/**
 * String Class Extension function to get timestamp from Date object
 */
fun String.Companion.timestamp(date: Date = Date(), format: String = "E MMM dd, yyyy hh:mm:ss a"): String = SimpleDateFormat(format).format(date)

/**
 * String Class Property to get a whitespace character
 */
val String.Companion.WHITESPACE_CHAR: String
    get() = " "

/**
 * Date Extension function to get a formatted timestamp from Date object
 */
fun Date.format(format: String = "E MMM dd, yyyy hh:mm:ss a"): String = SimpleDateFormat(format).format(this)