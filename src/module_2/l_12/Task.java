package module_2.l_12;

public class Task extends Thread{

    public Task(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i< 10; i++) {
            System.out.println("Thread " + getName() + " iteration : " + i);
            try {
                Thread.sleep(3000);
                Thread.yield();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
