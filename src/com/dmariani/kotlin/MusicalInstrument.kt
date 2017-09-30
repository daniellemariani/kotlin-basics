package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
abstract class MusicalInstrument(val name: String, val type: Type) : PlayInstrument {

    enum class Type {
        STRING, WIND, PERCUSSION
    }

    override fun startPlaying(): String = "Start playing Generic instrument"

    override fun stopPlaying(): String = "Stop playing Generic instrument"

}