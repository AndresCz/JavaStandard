package dario.java.std;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class SetsExample {

    
    public static void main(String[] args) {
//        Set<String> s1 = new HashSet<>();
//        s1.add("Hola");
//        s1.add("Hola");
//        s1.add("Hola");      
//        s1.add("Chau");
//        s1.add("Cómo estás?");
//        s1.add("Cómo estás vos?");
//        
//        // old java
//        System.out.println("old java");
//        Iterator<String> it1 = s1.iterator();
//        while (it1.hasNext()){
//            System.out.println(it1.next());
//        }
//        
//        // pido otro iterador porque no se pueden reutilizar
//        System.out.println("old java - segundo iterador");
//        Iterator<String> it2 = s1.iterator();
//
//        while (it2.hasNext()){
//            System.out.println(it2.next());
//        }
//
//        // for each (1.5+)
//        System.out.println("for each");
//        for (String s : s1) {
//            System.out.println(s);
//        }
//        
//        // functional (8+)
//        System.out.println("functional");
//        s1.forEach(s -> System.out.println(s));
//        
//        // functional member reference
//        System.out.println("functional");
//        s1.forEach(System.out::println);
//
//       
//        Set<String> ordenado = new TreeSet<>();
//        ordenado.add("Hola");
//        ordenado.add("Hola");
//        ordenado.add("Hola");      
//        ordenado.add("Chau");
//        ordenado.add("Cómo estás?");
//        ordenado.add("Cómo estás vos?");        
//                
//        // functional member reference
//        System.out.println("sorted set");
//        ordenado.forEach(System.out::println);
//        
        
        // equals / hashcode en Sets
        
        
        /*
           Este treeSet ordena los elementos por su orden natural
        */
        Set<Persona> personas = new TreeSet<>();
        personas.add(new Persona("Juan", "Pérez", "1111111"));
        personas.add(new Persona("Juan", "Gómez", "2222222"));
        personas.add(new Persona("Juan", "Gómez", "1111111"));
        personas.add(new Persona("Hector", "Peralta", "2222222"));
        personas.add(new Persona("Darío", "Hruszecki", "33333333"));
        personas.add(new Persona("Nicolás", "Hruszecki", "33333334"));
        personas.add(new Persona("Norberto", "Hruszecki", "33333335"));
        personas.forEach(System.out::println);
       
        
        /* 
            Si le pasamos un comparator parámetros no utiliza el orden 
            natural
        */
        Set<Persona> personasPorDni = new TreeSet<>(new PersonasPorDni());
        personasPorDni.add(new Persona("Juan", "Pérez", "1111111"));
        personasPorDni.add(new Persona("Juan", "Gómez", "2222222"));
        personasPorDni.add(new Persona("Juan", "Gómez", "1111111"));
        personasPorDni.add(new Persona("Hector", "Peralta", "2222222"));
        personasPorDni.add(new Persona("Darío", "Hruszecki", "33333333"));
        personasPorDni.add(new Persona("Nicolás", "Hruszecki", "33333334"));
        personasPorDni.add(new Persona("Norberto", "Hruszecki", "33333335"));

        personasPorDni.forEach(System.out::println);

    }
    
}

class PersonasPorDni implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDni().compareTo(o2.getDni());
    }
    
}
