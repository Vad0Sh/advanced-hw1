package homework3.task3;

public class Main {
    public static void main(String[] args) {
        String str1 = "The class String includes" +
                " methods for examining individual characters of the sequence," +
                " for comparing strings, for searching strings, for extracting substrings," +
                " and for creating a copy of a string with all characters" +
                " translated to uppercase or to lowercase.";
        System.out.println(str1.substring(0,((str1.length())/2)));
        System.out.println(str1.substring((((str1.length())/2)+1)));

    }
}
