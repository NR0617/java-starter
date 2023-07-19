package chapter15.stream.sirialization;

import java.io.*;


class Person implements Serializable{ //Marker 인터페이스

    @Serial
    private static final long serialVersionUID = 8886096394973229572L;
    String name;
    transient String title;

    public Person() {
    }

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String toString() {
        return name + ", " + title;
    }

}

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person personLee = new Person("Lee", "manager");
        try(FileOutputStream fos = new FileOutputStream("serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(personLee);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileInputStream fis = new FileInputStream("serial.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Object obj = ois.readObject();
            Person p = (Person) obj;
            System.out.println(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
