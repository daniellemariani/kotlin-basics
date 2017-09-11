import com.dmariani.kotlin.JPerson
import com.dmariani.kotlin.Person

fun main(args: Array<String>) {
    println("Hello World!")

    // Java interoperability
    var jPerson = JPerson()
    jPerson.age = 20 // java setter is implemented in a Kotlin way

    var jPerson2 = JPerson("Juan", "Garcia", 20)

    // Kotlin class
    var person = Person()
    person.age = 20

    var person2 = Person("Juan", "Garcia", 20)
}