package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {

            FileInputStream fis = new FileInputStream(fileName);
            Class c = Class.forName(className);
            return c;

    }
    public static void main(String[] args) {
        ThrowsException ex = new ThrowsException();
        try {
            ex.loadClass("b.txt", "java.lang.string");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("end");
    }
}
