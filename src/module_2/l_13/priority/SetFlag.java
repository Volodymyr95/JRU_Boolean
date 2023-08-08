package module_2.l_13.priority;

public class SetFlag extends Thread {

    private Flag flag;

    public SetFlag(String name, Flag flag) {
        super(name);
        this.flag = flag;
    }

    @Override
    public void run() {
        flag.setFlag(getName());
        System.out.println(flag.getFlag());
    }
}
