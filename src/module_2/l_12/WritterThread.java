package module_2.l_12;

public class WritterThread extends Thread {

    private VolatileFlag volatileFlag;

    public WritterThread(VolatileFlag volatileFlag) {
        this.volatileFlag = volatileFlag;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            volatileFlag.setFlag();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
