package homework1.task2;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Zebra");
        list.add("Lion");
        list.add("Monkey");
        list.add("Elephant");
        list.add("Snake");
        list.add("Chicken");
        list.add("Tiger");
        list.add("Giraffe");
        list.add("Cheetah");
        list.add("Hippo");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
