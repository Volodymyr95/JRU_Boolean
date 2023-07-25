package module_2.l_9.methods;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {

        String hello = "Hello";  //obj1 => Hello
         hello.toUpperCase();  //obj2 => HELLO

        ArrayList<String> strings = new ArrayList<>();
        Person john = new Person("John", 42, strings);

        john.getSkills().add("");

    }
}
