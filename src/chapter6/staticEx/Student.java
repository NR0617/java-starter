package chapter6.staticEx;

public class Student {
    // 인스턴스가 공유하는 값은 static
    private static int serialNumber = 10000;
    int studentId;
    String studentName;
    public Student() {
        serialNumber++;
        studentId = serialNumber;
    }

    public static int getSerialNumber() {
        // 지역변수 -> stack이 생길때 생기고 사라질때 사라진다.
        int i = 10;
        // 인스턴스 변수==멤버변수 ->
        // studentName = "홍길동";
        // static 변수==클래스변수 ->
        return serialNumber;
    }
}
