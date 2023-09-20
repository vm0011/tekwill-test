package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private long year;

    public void setDay(int day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        }
    }

    public void setYear(long year) {
        if (year >= 0) {
            this.year = year;
        }
    }

    public void displayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
