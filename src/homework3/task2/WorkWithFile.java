package homework3.task2;

import java.io.*;

public class WorkWithFile {
    public static void main(String[] args) throws Exception {
        File file = new File("src/homework3/task2/test.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        FileReader fileReader = new FileReader(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedWriter.write("Hello! My name is Vadim!");
        bufferedWriter.newLine();
        bufferedWriter.write("I am a student.");
        bufferedWriter.flush();
        bufferedWriter.close();

        while (bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }
    }
}
