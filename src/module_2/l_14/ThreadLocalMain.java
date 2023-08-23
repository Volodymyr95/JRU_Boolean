package module_2.l_14;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalMain {
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(
                () -> {
                    threadLocal.set(42);
                    threadLocal.set(20);
                    System.out.println("Thread 1 - Thread local value: " + threadLocal.get());
                });

        Thread thread2 = new Thread(
                () -> {
                    threadLocal.set(50);
                    System.out.println("Thread 2 - Thread local value: " + threadLocal.get());
                });
        threadLocal.set(22);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Main thread ThreadLocal value: " + threadLocal.get());

    }
}
