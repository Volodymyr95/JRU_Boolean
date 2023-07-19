package module_2.l_8.inheritance_contructor;

import java.util.Random;

public class Child extends Parent {
    public String name;

    public Child(String name) {
        super(name);
        this.name = name;
    }
}
