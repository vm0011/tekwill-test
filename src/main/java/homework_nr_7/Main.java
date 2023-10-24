package homework_nr_7;

public class Main {
    public static void main(String[] args) {
        Manager m1 = new Manager("Vasea", "Andreev", "Google", 10, "G-team");
        Programmer p1 = new Programmer("neVasea", "neAdreev", "neGoogle", "Java", 10);
        //Person person1 = p1;

        System.out.println("----------call-Manager-methods----------------");
        m1.printMyName();
        m1.work();
        System.out.println("----------call-Programmer-methods-------------");
        p1.printMyName();
        p1.work();

        System.out.println("----------create Person array-----------------");
        Person[] personArr = new Person[]{m1, p1};

        //System.out.println(personArr.length);
        System.out.println("-call-work-only-on-Manager-elements-of-array-");
        for (Person element : personArr) {
            if (element instanceof Manager temporary) {
                temporary.work();
                //System.out.println(((Manager) element).teamName);
            }
        }

        //System.out.println(((Programmer) person1).programmingLanguage);

    }
}
