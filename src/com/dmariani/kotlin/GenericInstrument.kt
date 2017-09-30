package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
class GenericInstrument (genericName: String,
                         genericType: MusicalInstrument.Type,
                         private val genericPlay : PlayInstrument? = null) : MusicalInstrument(genericName, genericType) {

    override fun startPlaying(): String = genericPlay?.startPlaying() ?: super.startPlaying()

    override fun stopPlaying(): String = genericPlay?.stopPlaying() ?: super.stopPlaying()
}