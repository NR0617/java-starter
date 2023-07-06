package Chapter6.cooperation;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;

    }
    public void take(int money) {
        passengerCount++;
        this.money += money;

    }
    public void showInfo() {
        System.out.println("지하철" + subwayNumber + "번의 승객수는 " + passengerCount + "명 이고, 수입은 " + money + "입니다.");
    }
}
