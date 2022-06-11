package homework7.task2;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Giraffe");

        Serializator serializator = new Serializator();
        System.out.println(serializator.serialization(animal));
        try {
            Animal animal1 = serializator.deserialization();
            System.out.println(animal1.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }

    }
}
