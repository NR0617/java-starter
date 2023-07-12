package chapter9.abstractEx;

public abstract class Desktop extends Computer{

    @Override
    public void display() {
        System.out.println("Desktop display()");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing()");
    }
    // 재정의 가능
    //    @Override
    //    public void turnOn() {
    //        // 구현부
    //        System.out.println("Desktop turnOn()");
    //    }
    //    @Override
    //    public void turnOff() {
    //        // 구현부
    //        System.out.println("Desktop turnOff()");
    //    }
}
