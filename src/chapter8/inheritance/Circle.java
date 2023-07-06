package chapter8.inheritance;

public class Circle {
    Point point; // has - a  관계, 합성 <-> 상속은 is - a  관계
    private int radius;
    public Circle() {
        point = new Point();
    }
}
