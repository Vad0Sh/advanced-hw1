package homework2.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list= new ArrayList<String>();
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<10;i++) {
            System.out.println("Введите значение: ");
            list.add(br.readLine());
        }
        ArrayList<String> result = doubleValues(list);
        for(int i=0;i<result.size();i++) {
            System.out.println(result.get(i));
        }
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list2=new ArrayList<String>();
        for(int i=0;i<list.size();i++) {
            list2.add(list.get(i));
            list2.add(list.get(i));
        }
        return list2;
    }
}
