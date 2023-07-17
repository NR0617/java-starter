package chapter12.collection.arraylist;


import java.util.ArrayList;

class MyStack{
    private ArrayList<String> arrayStack = new ArrayList<String>();
    public void push(String data) {
        arrayStack.add(data);
    }
    public String pop() {
        int len = arrayStack.size();
        if(len == 0) {
            System.out.println("스택이 비었습니다");
            return null;
        }
        String data = arrayStack.remove(len - 1);
        return data;
    }
    public String peek() {
        int len = arrayStack.size();
        if(len == 0) {
            System.out.println("스택이 비었습니다");
            return null;
        }
        String data = arrayStack.get(len - 1);
        return data;
    }
}

public class StackTest {

    public static void main(String[] args) {

        MyStack stack1 = new MyStack();
        stack1.push("a");
        stack1.push("b");
        stack1.push("c");

        System.out.println(stack1.pop());
        System.out.println(stack1.peek());

        System.out.println(stack1.pop());

        System.out.println(stack1.pop());

        System.out.println(stack1.pop());

    }
}
