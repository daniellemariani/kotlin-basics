import com.dmariani.kotlin.person.JPerson;
import com.dmariani.kotlin.person.Person;

/**
 * @author danielle.mariani
 */
public class JMain {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Java class instance
        JPerson jPerson = new JPerson();
        jPerson.setAge(20);

        // Kotlin class instance
        Person person = new Person();
        person.setAge(20);

        Person person2 = new Person("John", "Phillips", 20);

        // Person person3 = new Person("Maria"); Compilation error since parameters are invalid
    }
}
