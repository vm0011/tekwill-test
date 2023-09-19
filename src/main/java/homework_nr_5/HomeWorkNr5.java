package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int[] copyNumbers = new int[numbers.length];
        long prod = 1L;
        int sum = 0;
        boolean existOdd = false;
        // execute step 4
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers.length - i;
        }
        // execute step 5
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "]= " + numbers[i]);
        }
        // execute step 6
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } else {
                if (!existOdd) {
                    existOdd = true;
                }
                prod *= numbers[i];
            }
        }
        System.out.println("Сумма четных елементов: " + sum);
        if (existOdd) {
            System.out.println("Произведение нечетных элементов: " + prod);
        } else {
            System.out.println("Массив не содержит нечетных элементов.");
        }
        // execute step 7 copying
        System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);
        // check result
        System.out.println("----------numbers[i]------------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("------------copyNumbers[i]----------------");
        for (int i = 0; i < copyNumbers.length; i++) {
            System.out.print(copyNumbers[i] + " ");
        }
    }
}
