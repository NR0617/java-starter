package chapter6.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student james = new Student("james", 10000);
        Student tomas = new Student("tomas", 20000);

        Bus bus100 = new Bus(100);
        james.takeBus(bus100);
        james.showInfo();
        bus100.showInfo();

        tomas.takeBus(bus100);
        tomas.showInfo();
        bus100.showInfo();

        Subway subwayGreen = new Subway(2);
        tomas.takeSubway(subwayGreen);
        tomas.showInfo();
        subwayGreen.showInfo();


    }
}
