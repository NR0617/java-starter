package chapter9.gamelevel;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다");
    }

    @Override
    public void jump() {
        System.out.println("엄청 높이 점프합니다");
    }

    @Override
    public void turn() {
        System.out.println("한바퀴 회전합니다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("=====상습자 레벨입니다=====");
    }
}
