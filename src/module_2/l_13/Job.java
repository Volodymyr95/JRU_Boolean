package module_2.l_13;

public class Job extends Thread {


    public Job() {
    }

    public Job(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            System.out.println("Before sleeping " + getName());
            Thread.sleep(1000);
            System.out.println("After sleeping " + getName());
        } catch (InterruptedException e) {
            System.out.println("error");
        }
    }
}
