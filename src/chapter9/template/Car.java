package chapter9.template;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public abstract void wipe();

    public void washCar() {

    }

    ;

    public void startCar() {
        System.out.println("시동을 켭니다");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다");
    }

    // 템플릿 메서드
    public final void run() {
        startCar();
        drive();
        wipe();
        stop();
        washCar();
        turnOff();
    }
}
