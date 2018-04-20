package dario.java.std;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ListSorted {

    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        cola.add("Juan");
        cola.add("Pedro");
        cola.add("Jorge");
        cola.forEach(System.out::println);
    }

    public static void main2(String[] args) {
        System.out.println("Sorting with natural order");
        List<String> l1 = createList();
        l1.sort(null);
        l1.forEach(System.out::println);

        System.out.println("Sorting with a lamba expression for the comparison");
        List<String> l2 = createList();
        l2.sort((s1, s2) -> s1.compareToIgnoreCase(s2));  // sort ignoring case
        l2.forEach(System.out::println);

        System.out.println("Sorting with a method references");
        List<String> l3 = createList();
        l3.sort(String::compareToIgnoreCase);
        l3.forEach(System.out::println);

        Stack<String> pila = new Stack<>();
        pila.add("");
        pila.peek();
        pila.pop();

    }

    private static List<String> createList() {
        List<String> list = new ArrayList<>();
        list.add("iPhone");
        list.add("Ubuntu");
        list.add("Android");
        list.add("Mac OS X");
        return list;
    }

}
