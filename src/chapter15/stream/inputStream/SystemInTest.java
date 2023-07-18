package chapter15.stream.inputStream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("알파벳을 쓰고 엔터를 누르세요(종료하려면 엔터)");
        int i = 0;
        try {
             //i = System.in.read(); 1바이트씩 읽는다
            while ((i =System.in.read()) != '\n') {
                //아스키 값이 출력
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
