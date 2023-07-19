package chapter15.stream.decorator;

//import java.io.FileInputStream; -> 글자 깨진다

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

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
        Socket socket = new Socket();
        InputStreamReader ir = null;
        try {
           BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); //stream은 byte단위로 읽어보느데 reader가 문자로 바꿔준다
            //ir.read("reader.txt".toCharArray());
            br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
