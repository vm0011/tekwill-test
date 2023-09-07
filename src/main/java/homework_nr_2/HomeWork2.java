package homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args) {
        // execute step 4 from hw_nr_2
        System.out.println("Hello World!");
        System.out.println("------------");
        // execute step 5 from hw_nr_2
        // System.out.println("Begin step 5");
        float CurrentWorldPopulation = 7811080815f; // error for int, value too big
        int CarsProducedThisYear = 55235358;
        char FirstLetterInAlphabet = 'A';
        boolean JavaIsAmazing = true;
        float Pi = 3.14159f; // error delimiter in slack was (comma) ",", but was expected (dot/point) "."
        // print out values assigned to the variables
        System.out.println(CurrentWorldPopulation);
        System.out.println(CarsProducedThisYear);
        System.out.println(FirstLetterInAlphabet);
        System.out.println(JavaIsAmazing);
        System.out.println(Pi);
        // System.out.println("End step 5");
        System.out.println("------------");
        // System.out.println("Begin step 6");
        // execute step 6 from hw_nr_2
        double Price = 10;
        double Tax = 0.2;
        int Quantity = 3;
        double Sum = 0;
        double total = Price + Tax * Quantity + Sum;
        // print out values assigned to the variables
        System.out.println(Price);
        System.out.println(Tax);
        System.out.println(Quantity);
        System.out.println(Sum);
        total = Price + Tax * Quantity + Sum;
        System.out.println(total);
        // System.out.println("End step 6");
        System.out.println("------------");
    }
}
