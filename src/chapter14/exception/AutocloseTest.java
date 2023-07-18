package chapter14.exception;

public class AutocloseTest {
    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();
        // 자바 8? 9? 이후부터 try문 안에 obj넣는게 가능해졌다
        try(obj){
            throw new Exception();
        } catch (Exception e) {
            System.out.println("exception");
            //throw new RuntimeException(e);
        }
    }
}
