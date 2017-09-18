package com.dmariani.kotlin

/**
 * @author danielle.mariani
 */
open class MusicalInstrument(val name: String, val type: Type) {

    enum class Type {
        STRINGS, WIND, PERCUSSION
    }

}