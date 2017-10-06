package com.dmariani.kotlin.music

/**
 * @author danielle.mariani
 */
class MusicInstrument (val name: String, val type: Type) {

    enum class Type {
        STRINGS, WIND, PERCUSSION
    }

}