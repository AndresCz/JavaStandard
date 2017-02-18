package collections.set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.Person;

import static model.Person.Sex.MALE;

/**
 *
 * @author educacionit
 */
public class ElementsWithOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<String> nombresDesordenados = new HashSet();
        nombresDesordenados.add("Juan");
        nombresDesordenados.add("Pedro");
        nombresDesordenados.add("Algo");
        nombresDesordenados.add("Xavier");
        
        System.out.println("Nombres Desordenadods:");
        for (String nombre: nombresDesordenados) {
            System.out.println(nombre);
        }
        
        Set<String> nombresOrdenados = new TreeSet();
        nombresOrdenados.add("Juan");
        nombresOrdenados.add("Pedro");
        nombresOrdenados.add("Algo");
        nombresOrdenados.add("Xavier");
        
        System.out.println("Nombres Ordenadods:");
        for (String nombre: nombresOrdenados) {
            System.out.println(nombre);
        }
        
        Set<Person> personasOrdenadas = new TreeSet();
        personasOrdenadas.add(new Person("115", "Juan", "Peréz", LocalDate.now(), MALE, ""));
        personasOrdenadas.add(new Person("110", "Jorge", "López", LocalDate.now(), MALE, ""));
        personasOrdenadas.add(new Person("100", "Jorge", "Gómez", LocalDate.now(), MALE, ""));
        personasOrdenadas.add(new Person("113", "Hector", "Peréz", LocalDate.now(), MALE, ""));

        System.out.println("Nombres Ordenadods:");
        for (Person person : personasOrdenadas) {
            System.out.println(person);
        }
        
        
        
        
        
        
    }
    
}
