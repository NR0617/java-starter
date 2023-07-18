package chapter13.lambda;

interface PrintString{
    void showString(String str);
}
public class LambdaTest {
    public static void main(String[] args) {
        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("안녕 디지몬");

        showMyString(lambdaPrint);

        PrintString reStr = returnPrint();
        reStr.showString("Hello");
    }

    public static void showMyString(PrintString lambda) {
        lambda.showString("여기는 showString");
    }

    public static PrintString returnPrint() {
        return s-> System.out.println(s + " world");
    }
}
