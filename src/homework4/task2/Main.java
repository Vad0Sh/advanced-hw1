package homework4.task2;

public class Main {
    public static String replacement = "Java";

    public static void main(String[] args) {

        String str1 = "The class String includes" +
                " methods for examining individual characters of the sequence," +
                " for comparing strings, for searching strings, for extracting substrings," +
                " and for creating a copy of a string with all characters" +
                " translated to uppercase or to lowercase.";
        System.out.println(str1);
        str1 = str1.replaceAll(String.format("\\b\\w{%d}\\b", 1), replacement);
        str1 = str1.replaceAll(String.format("\\b\\w{%d}\\b", 2), replacement);
        str1 = str1.replaceAll(String.format("\\b\\w{%d}\\b", 3), replacement);
        System.out.println(str1);

    }
}
