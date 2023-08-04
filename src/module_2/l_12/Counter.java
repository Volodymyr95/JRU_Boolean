package module_2.l_12;

public class Counter {

    private int cout = 0;

    public void increment() {
        synchronized (this) {
            cout++;
        }
    }

    public void getCount() {
        System.out.println(cout);
    }
}
