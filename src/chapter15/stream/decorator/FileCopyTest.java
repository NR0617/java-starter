package chapter15.stream.decorator;


import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {
        long milliseconds = 0;
        int len = 0;

        try(FileInputStream fis = new FileInputStream("a.exe");
            FileOutputStream fos = new FileOutputStream("b.exe");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            milliseconds = System.currentTimeMillis();
            int i;
            while((i = fis.read()) != -1) {
                fos.write(i);
                len++;
            }
            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(milliseconds);
        System.out.println(len);

    }
}
