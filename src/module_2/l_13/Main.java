package module_2.l_13;

import module_2.l_13.priority.Flag;
import module_2.l_13.priority.SetFlag;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        ThreadGroup backgroundJobs = new ThreadGroup("Background Jobs");

//        Thread thread1 = new Thread(backgroundJobs, () -> {
//            System.out.println("Do smth...1");
//        });
//
//        Thread thread2 = new Thread(backgroundJobs, () -> {
//            System.out.println("Do smth...2");
//        });

//        Job thread1 = new Job(backgroundJobs, "job 1");
//        Job thread2 = new Job(backgroundJobs, "job 2");

//        thread1.start();
//        thread2.start();

//        Job daemon = new Job();
        //daemon.setDaemon(true);
//        daemon.start();

//        backgroundJobs.list();
//        // backgroundJobs.interrupt();
//        System.out.println("Active thread count: " + backgroundJobs.activeCount());
//
//        thread1.join();
//        thread2.join();
//
//        System.out.println("Active thread count: " + backgroundJobs.activeCount());
//        System.out.println("END!");
//        Job job = new Job();
//        job.setPriority(10);
//        Flag flag = new Flag();
//        SetFlag setFlag1 = new SetFlag("1", flag);
//        SetFlag setFlag2 = new SetFlag("2", flag);
//        SetFlag setFlag3 = new SetFlag("3", flag);
//
//        setFlag1.setPriority(1);
//        setFlag2.setPriority(10);
//        setFlag3.setPriority(5);
//
//        setFlag1.start();
//        setFlag2.start();
//        setFlag3.start();
        Object lock = new Object();
        new WaitThread(lock).start();
        new NotifyThread(lock).start();

    }
}
