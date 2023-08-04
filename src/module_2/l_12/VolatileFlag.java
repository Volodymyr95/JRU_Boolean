package module_2.l_12;

public class VolatileFlag {

    private  boolean flag = false;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag() {
        this.flag = !flag;
    }
}
