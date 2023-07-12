package chapter10.interfaceEx;

public interface Calc {

    // public static final
    double PI = 3.14;
    float ERROR = 999999f;

    // interface 안에 선언이 되면 전부 public abstrict
    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int devide(int num1, int num2);


}
