package module_2.l_16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableMain {
    public static void main(String[] args) throws IOException {

        Person person = new Person("John", "Doe", "password!");

        try (FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            objectOutputStream.writeObject(person);
            System.out.println("END!");
        }
    }
}
