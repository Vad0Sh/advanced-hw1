package homework7.task2;

import java.io.*;

public class Serializator {
    public boolean serialization(Animal animal){
        boolean flag = false;
        File file = new File("src/homework7/task2/test.txt");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            if(fos!=null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(animal);
                flag = true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null) {
               try {
                   oos.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
            }
        }
        return flag;
    }
    public Animal deserialization() throws InvalidObjectException {
        File file = new File("src/homework7/task2/test.txt");
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            if(fis!=null) {
                ois = new ObjectInputStream(fis);
                Animal animal = (Animal) ois.readObject();
                return animal;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
            ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    throw new InvalidObjectException("Object fail");

    }
}
