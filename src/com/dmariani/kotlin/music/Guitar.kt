package com.dmariani.kotlin.music

/**
 * Example of a child class in Kotlin
 *
 * @author danielle.mariani
 */
class Guitar (val electric: Boolean = false) : MusicalInstrument("Guitar", Type.STRING) {

    override fun startPlaying() {
        println("Start playing the guitar")
    }

    override fun stopPlaying() {
        println("Stop playing the guitar")
    }

}