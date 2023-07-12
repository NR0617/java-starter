package chapter9.abstractEx;

public abstract class Computer {
    // 추상클래스는 인스턴스화 할 수 없다.
    // 메서드의 바디는 상속받은 하위 클래스에서 구성한다.
    public abstract void display();
    public abstract void typing();
    public void turnOn() {
        // 구현부
        System.out.println("전원을 켭니다");
    }
    public void turnOff() {
        // 구현부
        System.out.println("전원을 끕니다");
    }
}
