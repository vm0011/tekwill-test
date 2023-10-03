package homework_nr_8;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void printToDoList(ArrayList<String> toDoList) {
        int i = 1;
        for (String element : toDoList) {
            System.out.println(i + ". " + element);
            i++;
        }
    }

    public static HashSet<String> deduplicateValues(ArrayList<String> arrayList) {
        HashSet<String> deduplicated = new HashSet<>();
        for (String element : arrayList) {
            deduplicated.add(element);
        }
        return deduplicated;
    }

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        TenWordDictionary dict = new TenWordDictionary();
        toDoList.add("Java Homework 8");
        toDoList.add("Java Homework 8");
        toDoList.add("Java Homework 8");
        toDoList.add("Get to work");
        toDoList.add("Hard work till 5 PM");
        toDoList.add("Enjoy the rest of time");

        System.out.println("---------------------");
        System.out.println("Print your task list:");
        printToDoList(toDoList);

        System.out.println("---------------------");
        System.out.println("Print uniq values from task list:");
        System.out.println(deduplicateValues(toDoList));

        System.out.println("---------------------");
        System.out.println("Call 10 word dictionary");
        dict.translateWord("money");
    }
}
