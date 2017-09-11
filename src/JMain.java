import com.dmariani.kotlin.JPerson;
import com.dmariani.kotlin.Person;

/**
 * @author danielle.mariani
 */
public class JMain {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        JPerson jPerson = new JPerson();
        jPerson.setAge(20);

        JPerson jPerson2 = new JPerson("Juan", "Garcia", 20);

        // Java interoperability
        Person person = new Person();
        person.setAge(20);

        Person person2 = new Person("Juan", "Garcia", 20);

        // Person person3 = new Person("Luis"); Compilation error
    }
}
