package module_2.l_11;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread("MyThread");
        System.out.println(myThread.getName());

//        myThread.start();
//        Thread.sleep(3000);
//        myThread.interrupt();


//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();
//        Thread.sleep(4000);
//        thread.interrupt();  // throw new InterruptedException() inside MyRunnable
//        thread.interrupt();  // throw new InterruptedException() inside MyRunnable


//        System.out.println("Main start!");
//
//        new MyThread("Thread_1").start();
//        new MyThread("Thread_2").start();
//        new MyThread("Thread_3").start();
//        MyThread myThread = new MyThread("Thread_4");
//
//        String mainThreadName = Thread.currentThread().getName();
//
//        try {
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(800);
//                System.out.println(mainThreadName + ": " + i);
//            }
//        } catch (InterruptedException e) {
//            System.out.println(mainThreadName + " interrupted!");
//        }
    }
}
