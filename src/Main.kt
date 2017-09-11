import com.dmariani.kotlin.JPerson
import com.dmariani.kotlin.Person

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
}