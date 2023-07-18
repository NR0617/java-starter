package chapter13.Innerclass;

class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;
    public OutClass() {
        inClass = new InClass();
    }
    private class InClass{
        // 인스턴스의 내부 클래스에서는 static 변수나 static 함수를 사용할 수 없다
        int inNum = 200;
//      static int sInNum = 100;
        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }
//        static void sTest() {
//        }
    }

    public void usingInTest() {
        inClass.inTest();
    }
    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            //num += 10;
            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }
        static void sTest() {
            //num += 10;
            sNum += 10;
            System.out.println(sNum);
            //System.out.println(iNum);
            System.out.println(sInNum);
        }
    }
}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.usingInTest();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();
        OutClass.InStaticClass.sTest();

//        outClass.inClass.inTest();
//        OutClass.InClass inClass = outClass.new InClass();
//        inClass.inTest();
    }
}
