package homework5.task2;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car[] c = {c1, c2, c3};


        Class cl = Car.class;
        System.out.println("=======================================================");
        System.out.println("Name of class: ");
        System.out.println("");
        System.out.println(cl.getName());
        System.out.println(cl.getModifiers());
//        System.out.println("=======================================================");
//
//        System.out.println("Constructors of class: ");
//        System.out.println("");
//        Constructor[] constructors = cl.getDeclaredConstructors();
//        for (Constructor constructor: constructors ){
//            System.out.println(constructor.getName());
//            Parameter[] parameters = constructor.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println(parameter.getName());
//                System.out.println(parameter.getType().getName());
//            }
//        }
//        System.out.println("==================================================================");
//        System.out.println("Methods of class: ");
//        System.out.println("");
//        Method[] methods = cl.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//            Parameter[] parameters = method.getParameters();
//            for (Parameter parameter : parameters) {
//                System.out.println(parameter.getName());
//                System.out.println(parameter.getType().getName());
//            }
//            System.out.println(Modifier.toString(method.getModifiers()));
//            System.out.println(method.getReturnType().getName());
//        }
//        System.out.println("================================================");
//        System.out.println("Fields of class: ");
//        System.out.println("");
//        Field[] fields = cl.getDeclaredFields();
//        for (Field field : fields){
//            System.out.println(field.getName());
//            System.out.println(field.getType().getName());
//            System.out.println(Modifier.toString(field.getModifiers()));
//        }


//        Arrays.sort(c);
//        for (Car temp : c) {
//            System.out.println(temp);
//        }
    }
}
