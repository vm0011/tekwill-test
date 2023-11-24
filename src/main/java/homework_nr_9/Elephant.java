package homework_nr_9;

public class Elephant extends Erbivor implements Animal {
    String name;

    public Elephant(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("The elephant, named " + this.name + ", is running");
    }

    @Override
    public void searchForFood() {
        System.out.println("The elephant, named " + this.name + ",  is searching for food");
    }

    @Override
    public void eat() {
        System.out.println("The elephant, named " + this.name + ",  is eating");
    }

    @Override
    public void rest() {
        System.out.println("The elephant, named " + this.name + ",  is resting");
    }

    @Override
    void eatVegetables() {
        System.out.println("The elephant, named " + this.name + ",  is an erbivor that eats plants");
    }
}
