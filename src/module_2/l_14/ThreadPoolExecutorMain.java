package module_2.l_14;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorMain {
    public static void main(String[] args) {
        int corePoolSize = 4;
        int maximumPoolSize = 5;
        int keepAliveTime = 10;
        var threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>());

        for (int i = 0; i <= 10_000; i++) {
            final int threadId = i;
            threadPoolExecutor.execute(
                    () -> {
                        System.out.println("Task " + threadId + " is running " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            System.out.println("Interrupted");
                        }
                        System.out.println("Task " + threadId + " is completed ");

                    }
            );
        }

        threadPoolExecutor.shutdown();
    }
}
