package homework_nr_9;

public interface Animal {

    void run();

    void searchForFood();

    void eat();

    default void rest() {
        System.out.println("The animal is resting.");
    }
}
