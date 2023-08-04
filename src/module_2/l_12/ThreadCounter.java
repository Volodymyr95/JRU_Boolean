package module_2.l_12;

public class ThreadCounter extends Thread {

    private Counter counter;

    public ThreadCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000_00; i++) {
            counter.increment();
        }
    }
}
