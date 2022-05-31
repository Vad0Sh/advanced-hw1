package homework3.task4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("src/homework3/task4/temp.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        FileReader fileReader = new FileReader(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedWriter.write("Hello! This is Kyiv. The Kyiv is the capital of Ukraine.");
        bufferedWriter.newLine();
        bufferedWriter.write("Kyiv is one of the oldest cities .");
        bufferedWriter.flush();
        bufferedWriter.close();

        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}
