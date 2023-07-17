package chapter11.integer;

public class IntegerEx {
    public static void main(String[] args) {
        //Integer는 객체 형태
        Integer num1 = 3;
        //int는 자료형
        int num2 = 2;
        int sum = num1 + num2; //num1은 언박싱
        Integer num3 = num2; // num2는 오토박싱

        System.out.println(sum);

    }

}
