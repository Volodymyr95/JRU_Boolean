package module_2.l_13.callable;

import java.util.concurrent.Callable;

public class CheckCurrency implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "USD - 37.7";
    }
}
