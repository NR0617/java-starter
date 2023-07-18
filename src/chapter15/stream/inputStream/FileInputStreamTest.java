package chapter15.stream.inputStream;

//import java.io.FileInputStream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileReader fileInput = null;
        int i = 0;
        try {
             //fileInput = new FileInputStream("input.txt");
            fileInput = new FileReader("input.txt");


            while (( i = fileInput.read()) != -1) {
                System.out.print((char) i);
            }
//            System.out.print((char) fileInput.read());
//            System.out.print((char) fileInput.read());
//            System.out.print((char) fileInput.read());
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);

//            throw new RuntimeException(e);
        } finally {
            try {
                fileInput.close();
            } catch (IOException e) {
                System.out.println(e);
                //throw new RuntimeException(e);
            } catch (NullPointerException e) {
                System.out.println(e);

                //throw new RuntimeException(e);
            }
        }
        // end가 찍히지 않으면 시스템이 죽은 것
        System.out.println("end");

    }
}
