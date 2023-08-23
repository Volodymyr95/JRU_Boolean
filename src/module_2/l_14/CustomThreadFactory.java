package module_2.l_14;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println("Hello from CustomThreadFactory");
        return new Thread(r);
    }
}
