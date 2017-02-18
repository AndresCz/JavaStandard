package model;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author educacionit
 */
public class Person implements Comparable<Person> {

    private String id;
    private String name;
    private String lastName;
    private Sex gender;
    private LocalDate birthday;
    private String emailAddress;


    public Person(String id, String name, String lastName, LocalDate birthday, Sex gender, String emailAddress) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.birthday = birthday;
        this.emailAddress = emailAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public enum Sex {
        MALE, FEMALE
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return birthday
                .until(IsoChronology.INSTANCE.dateNow())
                .getYears();
    }

    public void printPerson() {
        System.out.println(name + ", " + this.getAge());
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static List<Person> createList() {

        List<Person> personList = new ArrayList<>();
        personList.add(
                new Person("1",
                        "Juan",
                        "Perez",
                        IsoChronology.INSTANCE.date(1980, 6, 20),
                        Person.Sex.MALE,
                        "jperez@example.com"));
        personList.add(
                new Person("2",
                        "Jane",
                        "Doe",
                        IsoChronology.INSTANCE.date(1990, 7, 15),
                        Person.Sex.FEMALE,
                        "janedoe@example.com"));
        personList.add(
                new Person("3",
                        "Jorge",
                        "Porcel",
                        IsoChronology.INSTANCE.date(1991, 8, 13),
                        Person.Sex.MALE,
                        "jp@example.com"));
        personList.add(
                new Person("4",
                        "Bob",
                        "Esponja",
                        IsoChronology.INSTANCE.date(2000, 9, 12),
                        Person.Sex.MALE,
                        "bob@example.com"));

        return personList;
    }

    /* @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.id);
        return hash;
    }*/

    @Override
    public int compareTo(Person o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id != null ? id.equals(person.id) : person.id == null;

    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
