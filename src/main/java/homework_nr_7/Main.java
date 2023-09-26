package homework_nr_7;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("vasea", "andreev", "google", 10, "g-team");
        Programmer p1 = new Programmer("neVasea", "neAdreev", "neGoogle", "Java", 10);
        //Person person1 = p1;

        m1.printMyName();
        m1.work();

        p1.printMyName();
        p1.work();

        Person[] personArr = new Person[]{m1, p1};

        System.out.println(personArr.length);

        for (Person element : personArr) {
            if (element instanceof Manager) {
                ((Manager) element).work();
                //System.out.println(((Manager) element).teamName);
            }
        }

        //System.out.println(((Programmer) person1).programmingLanguage);

    }
}
