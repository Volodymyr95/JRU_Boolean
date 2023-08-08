package module_2.l_13.callable;

import java.util.concurrent.FutureTask;

public class CallableMain {
    public static void main(String[] args) throws Exception {
//        CheckCurrency checkCurrency = new CheckCurrency();
//        String call = checkCurrency.call();
//        System.out.println(call);
//        System.out.println("END!");


        CheckCurrency checkCurrency = new CheckCurrency();
        FutureTask<String> stringFutureTask = new FutureTask<String>(checkCurrency);
        new Thread(stringFutureTask).start();

        String s = stringFutureTask.get();
        System.out.println(s);

        System.out.println("END!");
    }
}
