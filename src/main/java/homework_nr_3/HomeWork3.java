package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        // execute step 4 from hw_nr_3
        // Solution inspired from: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
        // Set the month number, value from 1 to 12
        int month = 0;
        String monthName;
        switch (month) {
            case 1:  monthName = "Январь";
                break;
            case 2:  monthName = "Февраль";
                break;
            case 3:  monthName = "Март";
                break;
            case 4:  monthName = "Апрель";
                break;
            case 5:  monthName = "Май";
                break;
            case 6:  monthName = "Июнь";
                break;
            case 7:  monthName = "Июль";
                break;
            case 8:  monthName = "Август";
                break;
            case 9:  monthName = "Сентябрь";
                break;
            case 10: monthName = "Октябрь";
                break;
            case 11: monthName = "Ноябрь";
                break;
            case 12: monthName = "Декабрь";
                break;
            default: monthName = "Недействительный номер месяца";
                break;
        }
        System.out.println(monthName);

        // execute step 5 from hw_nr_3
        System.out.println("-----------------------------------------");
        for(int number = 100; number <= 1000; number++){
            if (number % 5 == 0){
                System.out.print(number+" ");
            }
        }
        System.out.println();

        // execute step 6 from hw_nr_3
        System.out.println("-----------------------------------------");
        int i = 1;
        float sumOfSeries = 0f;
        while (i < 50){
            float dividend = 2 * i - 1; // 1, 3, 5, 7 ...
            // System.out.println(dividend);
            float divisor = 2 * i + 1; // 3, 5, 7, 9 ...
            // System.out.println(divisor);
            sumOfSeries+=dividend/divisor;
            // System.out.println(sumOfSeries);
            i++;
        }
        System.out.print("Сумма серии: 1/3 + 3/5 + 5/7 + ... + 95/97 + 97/99: " + sumOfSeries);
    }
}