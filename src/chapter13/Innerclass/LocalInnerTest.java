package chapter13.Innerclass;

class Outer{
    int outNum = 100;
    static int sNum = 200;
    public Runnable getRunnable(int i) {
        int localNum = 100;
        class MyRunnable implements Runnable{

            @Override
            public void run() {
                //localNum += 100;
                //i += 10;

                System.out.println(sNum);
                System.out.println(outNum);
                System.out.println(localNum);
                System.out.println(i);
            }
        }
        return new MyRunnable();
    }
}
public class LocalInnerTest {
    public static void main(String[] args) {

        Outer outer = new Outer();
        //outer.getRunnable(0).run();
        Runnable runnable = outer.getRunnable(10);
        runnable.run();
    }
}
