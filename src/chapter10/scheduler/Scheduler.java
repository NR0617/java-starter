package chapter10.scheduler;

public interface Scheduler {
    void getNextCall();
    void sendCallToAgent();
}
