package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
abstract class MusicalInstrument(val name: String, val type: Type) : PlayInstrument {

    enum class Type {
        STRING, WIND, PERCUSSION
    }

}