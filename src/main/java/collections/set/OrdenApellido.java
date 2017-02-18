package collections.set;

import java.util.Comparator;

import model.Person;

/**
 *
 * @author educacionit
 */
public class OrdenApellido implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
           return o1.getLastName().compareTo(o2.getLastName());
    }
    
    
}
