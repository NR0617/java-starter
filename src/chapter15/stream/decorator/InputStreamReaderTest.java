package chapter15.stream.decorator;

//import java.io.FileInputStream; -> 글자 깨진다

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) {
        int i = 0;
        try(InputStreamReader fis = new InputStreamReader(new FileInputStream("reader.txt"))) {
            while((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
