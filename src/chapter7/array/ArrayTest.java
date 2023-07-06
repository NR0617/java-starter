package chapter7.array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbers1 = new int[] {0, 1, 2};
        int[] numbers2 = {0, 1, 2}; // 자바에서는 잘 쓰지 않음

        System.out.println(numbers1.length);

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("여기" + numbers[i]);
        }

    }
}
