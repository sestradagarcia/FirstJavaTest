package Conditionals;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task 3
        System.out.println("Enter your first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter your second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter your operator of choice:");
        String operator = scanner.next();

        switch(operator) {
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println("an invalid number was entered");
        }
    }
}
