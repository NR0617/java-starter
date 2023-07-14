package chapter10.scheduler;

import java.io.IOException;


public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        //R, L, P
        System.out.println("전화 상담 배분방식을 선택하세요. R, L, P");
        int ch = System.in.read();
//        System.out.println(ch);
        //System.out.println(Integer.parseInt("R"));

        Scheduler scheduler = null;

        if ('R' == ch || 'r' == ch) {
            scheduler = new RoundRobin();
        } else if ('L' == ch || 'l' == ch) {
            scheduler = new LeastJob();
        } else if ('P' == ch || 'p' == ch) {
            scheduler = new PriorityAllocation();

        } else {
            System.out.println("지원하지 않는 기능입니다");
            return;
        }
        scheduler.getNextCall();
        scheduler.sendCallToAgent();

    }
}
