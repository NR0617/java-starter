package chapter10.interfaceEx;

public class MyInterfaceTest implements MyInterface {
    @Override
    public void x() {
        System.out.println("x()");
    }

    @Override
    public void y() {
        System.out.println("y()");
    }

    @Override
    public void myMethod() {
        System.out.println("myMethod()");
    }

    public static void main(String[] args) {
        MyInterfaceTest myInterfaceTest = new MyInterfaceTest();
        X xClass = myInterfaceTest;
        xClass.x();
    }
}
