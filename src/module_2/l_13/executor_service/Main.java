package module_2.l_13.executor_service;

import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

//        executorService.submit(new WaitingThread("R1"));
//        executorService.submit(new WaitingThread("R2"));
//        executorService.submit(new WaitingThread("R3"));
//        executorService.submit(new WaitingThread("R4"));
//
//        executorService.shutdownNow();


//        Callable<Integer> callable = () -> {
//            Thread.sleep(4000);
//            return new Random().nextInt(50);
//        };
//        Future<Integer> submit = executorService.submit(callable);
//        System.out.println(submit.get(2, TimeUnit.SECONDS));

        var scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(3);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(
                () -> System.out.println("Runnable"),
                2,
                3,
                TimeUnit.SECONDS);

        scheduledThreadPoolExecutor.shutdown();
    }

}
