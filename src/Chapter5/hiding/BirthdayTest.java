package Chapter5.hiding;

class Birthday {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class BirthdayTest {

    public static void main(String[] args) {

        Birthday day = new Birthday();

        day.setDay(30);
        day.setMonth(12);
        day.setYear(2020);
    }

}
