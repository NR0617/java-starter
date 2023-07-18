package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("James");
        sList.add("Potato");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));
        System.out.println();

        for (String s : sList) {
            System.out.println(s);
        }
        System.out.println();
        sList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
