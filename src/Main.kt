import com.dmariani.kotlin.music.*
import com.dmariani.kotlin.person.JPerson
import com.dmariani.kotlin.person.Person
import com.dmariani.kotlin.singleton.JSingleton
import com.dmariani.kotlin.singleton.Singleton
import com.dmariani.kotlin.util.Features
import com.dmariani.kotlin.util.format
import com.dmariani.kotlin.util.timestamp
import java.util.*

fun main(args: Array<String>) {

    println("Hello World!")

    /*
     * Classes and instances
     */

    // Java interoperability
    var jPerson = JPerson()
    jPerson.age = 20 // Java setter is implemented in a Kotlin way, do not need to call setAge()

    var jPerson2 = JPerson("Juan", "Garcia", 20)

    // Kotlin class instance
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

    /*
     * Null Safety
     */

    var text: String = "demo" // Create a Non Null variable
    // text = null Compilation Error since text cannot be null

    var text2: String? = "demo" // Create a Nullable variable
    var length = text2?.length // Null Safe call using null safe operator '?'

    // However, Kotlin allow you to manage NPE
    text2 = null
    try {
        length = text2!!.length // It will throw NPE if text2 if null using non null asserted operator '!!'
    } catch (e : Exception) {
        println("Exception: text2 is null")
    }

    // Ternary Operator
    length = if (text2 != null) text2.length else -1

    // Elvis Operator
    length = text2?.length ?: -1

    println("text2 length $length")


    /*
     * Functions
     */

    person.foo()
    person.bar()
    println("Person #1 Full Name: ${person.fullName()}")
    println("Person #1 Is Adult?: ${person.isAdult()}")
    println("Person #1 Future Age within 5 years: ${person.futureAge(10)}")

    // Class Extension Function
    println("Now: ${String.timestamp()}")

    // Instance Extension Function
    val date = Date()
    println("Now: ${date.format()}")

    /*
     * Inheritance
     */

    val guitar = Guitar()
    val drums = Drums()

    // Delegation Example using object expressions
    val derivedInstrument = DerivedInstrument(object : MusicalInstrument("Piano", Type.STRING) {
        override fun startPlaying() {
            println("Start playing the Piano")
        }

        override fun stopPlaying() {
            println("Stop playing the Piano")
        }

    })

    println("Musical Instrument #1: ${guitar.name}")
    println("Musical Instrument #2: ${drums.name}")
    println("Musical Instrument #3: ${derivedInstrument.instrument.name}")
    play(guitar, drums, derivedInstrument)

    /*
     * Singleton
     */

    // Java Singleton
    val jSingleton = JSingleton.getInstance()
    jSingleton.print()

    // Kotlin Singleton
    Singleton.print()

    /*
     * More Features
     */

    // String Feature
    Features.stringMultiline()

    // If Feature
    Features.ifExpression(5, 10)

    // When Feature
    Features.whenExpression(1)
    Features.whenExpression(-1)
    Features.whenExpression("Hello World")
    Features.whenExpression(guitar)
    Features.whenExpression2(drums)

    // Range Feature
    Features.loops()

    // Map Feature
    Features.traverseMap()

    // List Feature
    Features.sortedList()
    Features.groupedList()
}

/**
 * Play and stop playing musical instruments
 */
fun play(vararg instruments: PlayInstrument) {
    for (instrument in instruments) {
        println(instrument.startPlaying())
        println(instrument.stopPlaying())
    }
}
