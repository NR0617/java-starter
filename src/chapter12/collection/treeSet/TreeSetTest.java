package chapter12.collection.treeSet;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        System.out.println(tree);
    }
}
