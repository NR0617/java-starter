package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();

            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                //e.printStackTrace();
               throw new RuntimeException(e);
            }
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
