package com.dmariani.kotlin.music

/**
 * Example of a child class in Kotlin
 *
 * @author danielle.mariani
 */
class Drums : MusicalInstrument("Drums", Type.PERCUSSION) {

    override fun startPlaying() {
        println("Start playing the drums")
    }

    override fun stopPlaying() {
        println("Stop playing the drums")
    }
}