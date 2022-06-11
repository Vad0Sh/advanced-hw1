package homework6.task2;

import java.util.Scanner;

@TestAnnotation
public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        System.out.println("Enter your operation:");
        String choose;
        choose = inp.next();
        switch (choose){
            case "+":
                System.out.println("Result: " + add( num1,num2));
                break;
            case "-":
                System.out.println("Result: " + sub( num1,num2));
                break;
            case "*":
                System.out.println("Result: " + mult( num1,num2));
                break;
            case "/":
                System.out.println("Result: " + div( num1,num2));
                break;
            default:
                System.out.println("Illegal Operation");
        }
    }
    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y) {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y) {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y) {
        int result = x/y;
        return result;
    }
}