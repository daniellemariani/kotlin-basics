package com.dmariani.kotlin.music

/**
 * Interface example in Kotlin
 *
 * @author danielle.mariani
 */
interface PlayInstrument {

    fun startPlaying()

    fun stopPlaying()

    fun demo() {

        // We can define default functions
        // similar to Interfaces in JDK 8

        println("PlayInstrument - Demo: default value")
    }

}