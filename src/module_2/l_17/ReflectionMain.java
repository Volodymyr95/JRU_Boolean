package module_2.l_17;

import java.lang.reflect.*;

public class ReflectionMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        User john = new User("John");
        Class<? extends User> aClass = john.getClass();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(john,"Mike");
        

        System.out.println(john.getName());

    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}