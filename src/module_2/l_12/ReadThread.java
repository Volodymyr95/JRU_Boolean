package module_2.l_12;

public class ReadThread extends Thread {

    private VolatileFlag volatileFlag;

    public ReadThread(VolatileFlag volatileFlag) {
        this.volatileFlag = volatileFlag;
    }

    @Override
    public void run() {
        int counter = 0;
        while (!volatileFlag.isFlag()) {
            System.out.println("Waiting...." + ++counter);
        }
        System.out.println("Done!");
    }
}
