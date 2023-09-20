package homework_nr_6;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Cisco 8818 Chassis",
                "Cisco 8818, 18-slot modular chassis, Bandwidth: 259.2 Tbps, Support Linecard: 36 QSFP56-DD 400 GbE with MACSec",
                5,
                70042.70d);

        Date date1 = new Date();
        date1.setDay(111);
        date1.setMonth(12);
        date1.setYear(11);

        System.out.println(invoice1.getAmount());
        System.out.println("--------------------");
        date1.displayDate();
    }
}
