package chapter9.abstractEx;

public class ComputerTest {
    public static void main(String[] args) {
        // Computer c1 = new Computer(); // 추상 클래스는 인스턴스화 할 수 없다
        //Computer c2 = new Desktop(); // 업캐스팅
        // Computer c3 = new Notebook(); // 추상 클래스
        // c2.display(); // Desktop에서 정의한 메서드가 실행된다
        Computer c4 = new MyNotebook();
        c4.display(); // Notebook에서 정의한 메서드가 실행된다
        c4.turnOn();
        Notebook c5 = new MyNotebook();
        c5.aaa();

    }
}
