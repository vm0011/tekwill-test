package homework_nr_9;

public class Main {
    public static void main(String[] args) {
        Animal elephant1 = new Elephant("BigEleph");
        Erbivor elephant2 = new Elephant("SmallEleph");

        elephant1.run();
        elephant1.searchForFood();
        elephant1.eat();
        elephant1.rest();

        elephant2.eatVegetables();
        elephant2.sleep();

    }
}
