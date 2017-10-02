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

    // Object - Singleton
    val jSingleton = JSingleton.getInstance()
    jSingleton.print()

    Singleton.print()

    // Nice Stuff
    stringMultiline()
    ifExpression(5, 10)
    whenExpression(1)
    whenExpression(-1)
    whenExpression("Hello World")
    whenExpression(guitar)
    checkInstrument(drums)
    rangeExpression(4)
    traverseMap()
    sortedList()
    groupedList()
}

fun play(vararg instruments: PlayInstrument) {
    for (instrument in instruments) {
        println(instrument.startPlaying())
        println(instrument.stopPlaying())
    }
}

/**
 * Strings
 */

fun stringMultiline() {
    val text = """
            |First Line
            |Second Line
            |Third Line
            """.trimMargin()

    println("$text")
}

/**
 * If Expression
 */

fun ifExpression(a: Int, b: Int) {

    // #1
    var max = a
    if (a < b) max = b

    // #2
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // #3
    max = if (a > b) a else b
}

/**
 * When Expression #1
 */

fun whenExpression(a: Any) {
    when(a) {
        is String -> println("I'm a String")
        is PlayInstrument -> println("I'm an instrument")
        is Int -> {
            println("I'm an Int")
            when(a) {
                in 1..100 -> println("it's between 1 and 100")
                0, -1 -> println("it's 0 or -1")
            }
        }
        else -> println("Unsupported type")
    }
}

/**
 * When Expression #2
 */

fun checkInstrument(instrument: MusicalInstrument) {

    val message = when(instrument.type) {
        MusicalInstrument.Type.WIND -> "Wind wind"
        MusicalInstrument.Type.STRING -> "String string"
        MusicalInstrument.Type.PERCUSSION -> "Percussion percussion"
    }

    println("Check instrument type $message")

}

/**
 * Range Expression
 */

fun rangeExpression(number: Int) {

    // if (number >= 1 && number <= 10
    if (number in 1..10) {
        println("Number $number is in this range [1,10]")
    }

    println("Increase Example 1..5")
    for (i in 1..5) {
        println("Number $i")
    }

    println("Decrease Example 5..1")
    for (i in 5..1) {
        println("Number $i")
    }

    println("DownTo Example 5..1")
    for (i in 5 downTo 1) {
        println("Number $i")
    }

    println("Step example")
    // step must not be equal to 1
    for (i in 1..10 step 2) {
        println("Number $i")
    }

    println("Step example 2")
    // step must not be equal to 1
    for (i in 10 downTo  1 step 2) {
        println("Number $i")
    }

    println("Until Example 1..10")
    // [1, 10)  --> 1..9
    for (i in 1 until 10) {
        println("Number $i")
    }
}

/**
 * Maps
 */

fun traverseMap() {
    val map = hashMapOf<String, Person>()
    map.put("P1", Person("Pepe", "M"))
    map.put("P2", Person("Mary", "L"))
    map.put("P3", Person("Luis", "M"))

    println("Destructuring Expression")
    for ((personId, person) in map) {
        println("Person id $personId - data -> $person")
    }

    val map2 = mapOf("P1" to Person("Pepe", "M"),
            "P2" to Person("Mary", "L"),
            "P3" to Person("Luis", "M"))

    println("ForEach with Lambda #1")
    map2.forEach { key, value ->
        println("Person id $key - data -> $value")
    }

    println("ForEach with Lambda #2")
    map2.entries.forEach {
        println("Person id ${it.key} - data -> ${it.value}")
    }

}

/**
 * Collections
 */

fun sortedList() {
    val people = listOf(Person("Pepe", "M"),
            Person("Mary", "L"),
            Person("Luis", "M"))

    println("ForEach sorted list")
    val sorted = people.sortedBy { it.firstName }
    sorted.forEach {
        println("${it.firstName}")
    }
}

fun groupedList() {
    val people = listOf(Person("Pepe", "M"),
            Person("Mary", "L"),
            Person("Luis", "M"))

    println("ForEach sorted list")
    val groups = people.groupBy { it.lastName[0] }

    groups.entries.forEach {
        println("${it.key} - Data -> ${it.value}")
    }
}
