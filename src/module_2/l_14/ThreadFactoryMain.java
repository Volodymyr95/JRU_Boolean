package module_2.l_14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadFactoryMain {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor(new CustomThreadFactory());
        executorService.submit(() -> System.out.println("Task"));
        executorService.shutdown();
    }
}
