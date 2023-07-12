package chapter8.inheritance2;

import java.util.ArrayList;

class Animal{
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal{
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}
class Tiger extends Animal{
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }
    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal{
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
    public void fly() {
        System.out.println("독수리가 날개를 폅니다");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

        Animal[] animalList = new Animal[3];
        animalList[0] = new Human();

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Tiger());
    }

    public void moveAnimal(Animal animal) {
        // 다형성, Animal 메서드만 보임
        animal.move();

        // 조건문이 없으면 animal에 Tiger가 왔을 때 자바가 죽어버림
        // instanceof는 타입을 체크하는 예약어
        if( animal instanceof Human) {
            // 다운캐스팅
            // 상속관계에 있을때 오버라이딩이 훨씬 좋음
            Human h = (Human)animal;
            h.readBook();
        }
        else if (animal instanceof Tiger) {
            Tiger t = (Tiger) animal;
            t.hunt();
        }
        else if (animal instanceof Eagle) {
            Eagle e = (Eagle) animal;
            e.fly();
        }
        else {
            System.out.println("지원되지 않는 기능입니다.");
        }
    }

}
