package module_2.l_13;

public class WaitThread extends Thread {

    private Object lock;

    public WaitThread(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
            try {
                lock.wait();
                System.out.println("Start processing....");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End processing");
        }
    }
}
