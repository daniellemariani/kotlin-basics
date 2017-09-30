import com.dmariani.kotlin.*
import com.dmariani.kotlin.MusicalInstrument.*

fun main(args: Array<String>) {
    println("Hello World!")

    // Java interoperability
    var jPerson = JPerson()
    jPerson.age = 20 // java setter is implemented in a Kotlin way

    var jPerson2 = JPerson("Juan", "Garcia", 20)

    // Kotlin class
    var person = Person() // using empty constructor
    person.age = 20

    var person2 = Person("Juan", "Garcia", 20) // using full-property constructor
    var person3 = Person("Luis") // using single-property constructor

    println("JPerson: " + jPerson) // print object memory reference
    println("Person: " + person) // print object properties

    // String interpolation
    var firstName = person2.firstName
    println("Person #2 First Name: $firstName")
    println("Person #3 Full Name: ${person3.firstName} ${person3.lastName}")

    var person4 = Person()
    person4.age = 20

    if (person == person4) {
        println("Person #1 and Person #4 are equals")
    }

    person2 = person

    if (person === person2) {
        println("Person #1 and Person #2 are the same instance")
    }

    if (person !== person4) {
        println("Person #1 and Person #4 are NOT the same instance")
    }

    // null safety
    var text: String = "demo"
    // text = null Compilation Error

    var text2: String? = "demo"
    var text2Length = text2?.length // Null Safe call

    text2 = null

    try {
        text2Length = text2!!.length // It will throw NPE if text2 is null
    } catch (e : Exception) {
        println("text2 is null")
    }

    // elvis operator
    text2Length = if (text2 != null) text2.length else 0
    text2Length = text2?.length ?: 0

    println("text2 length $text2Length")


    // functions
    person.foo()
    person.bar()
    println("Person #1 Full Name: ${person.fullName()} chars: ${person.fullNameLength()}")
    println("Person #1 Future Age within 5 years: ${person.futureAge(5)}")
    println("Person #1 Future Age within 5 years: ${person.futureAge()}")

    // Extension functions
    println("Now: ${String.timestamp()}")

    // Extension property
    println("Person #1: Length ${person.fullName().length} Middle Length: ${person.fullName().middleLength}")

    // Inheritance example
    val guitar = Guitar()
    val drums = Drums()
    val piano = GenericInstrument("Piano", Type.STRING, object : PlayInstrument {

        override fun startPlaying(): String = "Start playing the Piano"

        override fun stopPlaying(): String = "Stop playing the Piano"

    })

    val derivedInstrument = DerivedInstrument(piano)

    println("Musical Instrument #1: ${guitar.name}")
    println("Musical Instrument #2: ${drums.name}")
    println("Musical Instrument #3: ${piano.name}")
    play(guitar, drums, piano, derivedInstrument)

    val jSingleton = JSingleton.getInstance()
    jSingleton.print()
}

fun play(vararg instruments: PlayInstrument) {
    for (instrument in instruments) {
        println(instrument.startPlaying())
        println(instrument.stopPlaying())
    }

}
