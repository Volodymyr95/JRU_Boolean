package module_2.l_13.executor_service;

public class WaitingThread implements Runnable {

    private String name;

    public WaitingThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Before waiting " + name);
            Thread.sleep(2000);
            System.out.println("After waiting " + name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
