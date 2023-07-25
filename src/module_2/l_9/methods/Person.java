package module_2.l_9.methods;

import java.util.ArrayList;

public final class Person {
    private final String name;
    private final int age;
    private final ArrayList<String> skills;

    public Person(String name, int age, ArrayList<String> skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<String> getSkills() {
        return (ArrayList<String>) skills.clone();
    }
}
