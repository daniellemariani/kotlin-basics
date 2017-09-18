package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
class GenericInstrument (genericName: String,
                         genericType: MusicalInstrument.Type,
                         val genericPlay : PlayInstrument?) : MusicalInstrument(genericName, genericType) {

    override fun startPlaying(): String = genericPlay?.startPlaying() ?: "Start playing Generic instrument"

    override fun stopPlaying(): String = genericPlay?.stopPlaying() ?: "Stop playing Generic instrument"
}