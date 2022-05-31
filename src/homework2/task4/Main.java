package homework2.task4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
        public static void main(String[] args) throws IOException
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Map<String,String> addresses = new HashMap<String, String>();
            while (true)
            {
                System.out.println("Введите город: ");
                String city = reader.readLine();
                if(city.isEmpty())
                    break;
                System.out.println("Введите фамилию: ");
                String name = reader.readLine();
                if (!city.isEmpty() & !name.isEmpty())
                {
                    addresses.put(city, name);
                    System.out.println("Для завершения ввода пар, введите пустую строку.");
                }
                else break;
            }
            System.out.println("В каком городе ищем? ");
            String tempCity = reader.readLine();


            for (Map.Entry<String, String> pair: addresses.entrySet())
            {
                String city = pair.getKey();

                if (tempCity.equals(city))
                {
                    String name = pair.getValue();
                    System.out.println("В этом городе живет ");
                    System.out.println(name);
                }
            }
        }

    }