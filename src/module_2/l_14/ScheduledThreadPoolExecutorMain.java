package module_2.l_14;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorMain {

    public static void main(String[] args) {
        var scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(4);

        scheduledThreadPoolExecutor.schedule(
                () -> System.out.println("Hello"), 10, TimeUnit.SECONDS);
    }

}
