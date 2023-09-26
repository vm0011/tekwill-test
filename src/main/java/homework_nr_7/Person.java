package homework_nr_7;

public abstract class Person {
    String name;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String surname;

    public void printMyName(){
        System.out.println("My name is: " + name);
    }
}
