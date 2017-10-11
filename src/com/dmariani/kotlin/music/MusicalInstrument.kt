package com.dmariani.kotlin.music

/**
 * Example of a Abstract Class in Kotlin.
 *
 * To extend from a Class is necessary that the Parent Class is defined
 * as open or abstract since classes by default are consider as final
 * in Kotlin
 *
 * @author danielle.mariani
 */
abstract class MusicalInstrument(val name: String, val type: Type) : PlayInstrument {

    enum class Type {
        STRING, WIND, PERCUSSION
    }

}