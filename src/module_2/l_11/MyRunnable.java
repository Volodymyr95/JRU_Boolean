package module_2.l_11;

public class MyRunnable implements Runnable {
    public void run() {
        Thread current = Thread.currentThread();
        while (!current.isInterrupted()) {
            try { Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                //current.interrupt();
            }
            System.out.println("Tik"); }
    }
}
