package module_2.l_14;

import java.util.concurrent.Executors;

public class SingleThreadPoolExecutor {

    public static void main(String[] args) {
        var executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executorService.submit(
                    () -> {
                        System.out.println("Task_" + taskId + " Executed by: " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Task_" + taskId + " Completed!");
                    }
            );
        }

        executorService.shutdown();
    }
}
