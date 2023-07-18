package chapter14.exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

        try( FileInputStream fis = new FileInputStream("a.txt")) {

        } catch (IOException e) {
            //e.printStackTrace();

            throw new RuntimeException(e);
        }
        System.out.println("end");
    }
}
