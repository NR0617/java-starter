package chapter14.exception;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            return; // finally 구문이 실행된 다음 return을 수행 -> "end"만 안보임
        } finally {
            //catch의 실행여부와 무관하게 try가 실행됐으면 finally는 반드시 실행된다->따라서 file을 close할때 사용
            System.out.println("finally");
        }
        // 만약에 죽으면 "end"가 표현 안됨
        System.out.println("end");
    }
}
