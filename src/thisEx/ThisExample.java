package thisEx;

class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        // this == 현재 자기 자신(인스턴스)의 주소값
        System.out.println(this);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        BirthDay b1 = new BirthDay();
        BirthDay b2 = new BirthDay();
        System.out.println(b1);
        b1.printThis();
        System.out.println(b2);
        b2.printThis();
    }
}
