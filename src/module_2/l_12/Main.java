package module_2.l_12;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Counter counter = new Counter();
//
//        System.out.print("Initial size: ");
//        counter.getCount();
//
//        ThreadCounter threadCounter1 = new ThreadCounter(counter);
//        ThreadCounter threadCounter2 = new ThreadCounter(counter);
//
//        threadCounter1.start();
//        threadCounter2.start();
//
//        threadCounter1.join();
//        threadCounter2.join();
//
//        counter.getCount();

//        VolatileFlag volatileFlag = new VolatileFlag();
//
//        WritterThread writterThread = new WritterThread(volatileFlag);
//        ReadThread readThread = new ReadThread(volatileFlag);
//
//        writterThread.start();
//        readThread.start();

//         new Task("Task 1").start();
//         new Task("Task 2").start();
//         new Task("Task 3").start();

        Object resource1 = new Object();
        Object resource2 = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Waiting for resource 2");

            synchronized (resource2) {
                System.out.println("Need resource 2");
            }
        }});
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: ");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Waiting for resource 1");

            synchronized (resource1) {
                System.out.println("Need resource 1");
            }
        }});

        thread1.start();
        thread2.start();




    }
}
