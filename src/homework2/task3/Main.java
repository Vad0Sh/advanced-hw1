package homework2.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
        static int size;
         static int g=2147483647;
        public static void main(String[] args) throws Exception {

            List<Integer> integerList = getIntegerList();
            System.out.println("Минимальное число: ");
            System.out.println(getMinimum(integerList));
        }

        public static int getMinimum(List<Integer> array) {
            for (int i = 0; i < size; i++) {

                if(array.get(i)<=g) {
                    g = array.get(i);
                }
            }
            return g;
        }

        public static List<Integer> getIntegerList() throws IOException {
            ArrayList<Integer> list = new ArrayList<Integer>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите количество элементов: ");
            String s = reader.readLine();
            int q = Integer.parseInt(s);

            for (int i = 0; i < q; i++) {
                System.out.println("Введите элемент: ");
                String k = reader.readLine();
                list.add(Integer.parseInt(k));
            }
            size = list.size();
            return list;
        }
    }

