package com.dmariani.kotlin.music

/**
 * Delegation is a new way of managing Inheritance in Kotlin and it only applies in
 * Interfaces based on a class property
 *
 * @author danielle.mariani
 */
class DerivedInstrument(var instrument: MusicalInstrument) : PlayInstrument by instrument {

    // Define some logic here

}