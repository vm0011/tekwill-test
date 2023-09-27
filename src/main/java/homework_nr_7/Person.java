package homework_nr_7;

public abstract class Person {
    String name;
    String surname;

    //public static void Person(String name, String surname) {
    //    Person.name = name;
    //Person.surname = surname;
    //}

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printMyName() {
        System.out.println("My name is: " + name);
    }
}
