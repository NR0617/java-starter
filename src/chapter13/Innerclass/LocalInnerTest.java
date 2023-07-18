package chapter13.Innerclass;

class Outer{
    int outNum = 100;
    static int sNum = 200;

    //익명 이너클래스 - 단 하나의 추상클래스나 단 하나의 인터페이스만 구현할 수 있다
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("runnable");
        }
    };
    public Runnable getRunnable(int i) {
        int localNum = 100;
        return new Runnable() {
            @Override
            public void run() {

                System.out.println(sNum);
                System.out.println(outNum);
                System.out.println(localNum);
                System.out.println(i);
            }
        };

   }
}
public class LocalInnerTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
        //outer.getRunnable(0).run();
        Runnable runnable = outer.getRunnable(10);
        runnable.run();

        outer.runnable.run();
    }
}
