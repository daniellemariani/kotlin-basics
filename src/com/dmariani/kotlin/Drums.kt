package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
class Drums : MusicalInstrument("Drums", Type.PERCUSSION) {

    override fun startPlaying(): String = "Start playing the drums"

    override fun stopPlaying(): String = "Stop playing the drums"
}