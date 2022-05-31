package homework2.task5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            ArrayList<String> list = new ArrayList<String>();
            String s;
            System.out.println("Введите строки: ");
            while(true) {
                s = reader.readLine();
                if(s.equals("end")){
                    break;
                }
                list.add(s);
            }
            System.out.println("Вот Вам Ваши строки:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
