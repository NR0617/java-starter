package chapter13.lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber maxNum = (x, y) -> (x >= y) ? x : y;
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println(max);

        // 람다식으로 메서드를 구현하고 호출하면 내부에서 익명 클래스가 생성된다
        int i = 100;
        MyNumber aaa = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
                // 내부에서 i를 final로 처리하기 때문에 변환하려고 하면 에러 발생
                // i = 200;
                // 참조는 가능
                System.out.println(i);
                return 0;
            }
        };
    }
}
