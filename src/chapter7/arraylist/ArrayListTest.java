package chapter7.arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("add");
        list.add("bbb");
        list.add("ccc");

        for(int i = 0; i<list.size(); i++) {
            // ArrayList는 인덱스로 접근하는 방법을 지원하지 않음
            System.out.println(list.get(i));
        }
    }
}
