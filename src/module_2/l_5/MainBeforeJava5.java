package module_2.l_5;

import java.util.ArrayList;

public class MainBeforeJava5 {
    public static void main(String[] args) {

        //Before Java 5:

        ArrayList stringList = new ArrayList(); // List of String but List<Object>
        stringList.add("Tim");
        stringList.add("Paul");
        stringList.add("John");
        stringList.add(1);

        for (Object o : stringList) {
            System.out.println((String) o);
        }



    }
}