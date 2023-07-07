package module_2.l_5;

import java.util.ArrayList;

public class MainAfterJava5 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(); //type erasure from String to Object
        // ArrayList<Object> strings = new ArrayList<>()
        // <> - diamond operator - it means that we can use any type of data in this li
        strings.add("Tim");
        strings.add("Paul");
        strings.add("John");

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
