package homework5.task4;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        try {
            Animal animal = new Animal();
            Class cls = animal.getClass();
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName());
                System.out.println(field.getType().getName());
                System.out.println(Modifier.toString(field.getModifiers()));
            }
                Field field1 = cls.getDeclaredField("a");
                field1.setAccessible(true);
                System.out.println("a= " + field1.getInt(animal));
                field1.setInt(animal, 14);
                System.out.println("============new value===============");
                System.out.println("a= " + field1.getInt(animal));
                Field field2 = cls.getDeclaredField("d");
                System.out.println("d= " + field2.getDouble(animal));
                field2.setAccessible(true);
                field2.setDouble(animal, 100.34d);
                System.out.println("============new value===============");
                System.out.println("d= " + field2.getDouble(animal));
                Field field3 = cls.getDeclaredField("l");
                System.out.println("l= " + field3.getLong(animal));
                field3.setAccessible(true);
                field3.setLong(animal, 252L);
                System.out.println("============new value===============");
                System.out.println("l= " + field3.getLong(animal));
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

