package chapter10.interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
        Calculator calc1 = new CompleteCalc();
        CompleteCalc calc2 = new CompleteCalc();

        //Calc calc1 = new Calc();
        //Calc calc2 = new Calculator();
        System.out.println(calc.add(num1, num2));
    }

}
