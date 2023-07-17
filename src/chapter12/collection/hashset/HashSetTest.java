package chapter12.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<String>();

        boolean a1 = set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);

        boolean a2 =  set.add("aaa");
        System.out.println(set);
        System.out.println(a1);
        System.out.println(a2); // 같은 엘리먼트가 있어서 안들어갔다 == false

    }
}
