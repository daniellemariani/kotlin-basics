package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
class Guitar (val electric: Boolean = false) : MusicalInstrument("Guitar", Type.STRING) {

    override fun startPlaying(): String = "Start playing the guitar"

    override fun stopPlaying(): String = "Stop playing the guitar"
}