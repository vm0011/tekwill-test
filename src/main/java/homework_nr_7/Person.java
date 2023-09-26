package homework_nr_7;

public abstract class Person {
    static String name;
    static String surname;

    public Person(String name, String surname) {
        Person.name = name;
        Person.surname = surname;
    }

    public void printMyName() {
        System.out.println("My name is: " + name);
    }
}
