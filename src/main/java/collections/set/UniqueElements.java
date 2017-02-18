package collections.set;

import model.Person;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static model.Person.Sex.MALE;

/**
 *
 * @author educacionit
 */
public class UniqueElements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("111", "Juan", "Peréz", LocalDate.now(), MALE, "");
        Person p2 = new Person("112", "Jorge", "López", LocalDate.now(), MALE, "");
        Person p3 = new Person("111", "Juan", "Peréz", LocalDate.now(), MALE, "");
        
        Set<Person> persons = new HashSet();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        
        for (Person nombre: persons) {
            System.out.println(nombre);
        }            

    }
    
}
