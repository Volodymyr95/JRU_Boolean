package module_2.l_11;

public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                interrupt();
            }
            System.out.println("Tik");
            System.out.println(isInterrupted());
        }
    }
}
