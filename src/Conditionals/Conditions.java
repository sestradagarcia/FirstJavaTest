package Conditionals;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //task 1
        /* System.out.println("Enter your first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number:");
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println(num1 + " is bigger");
        }
        else{
            System.out.println(num2 + " is bigger");
        }

        System.out.println("Enter a number to check if its odd or even:");
        int num3 = scanner.nextInt();
        if (num3 % 2 ==0){
            System.out.println(num3 + " is even");
        }
        else {
            System.out.println(num3 +" is odd");
        }

        System.out.println("Enter a traffic light colour(red, yellow, green):");
        String colour = scanner.next();

        switch(colour) {
            case ("yellow"):
                System.out.println("wait");
                break;
            case ("red"):
                System.out.println("stop");
                break;
            case ("green"):
                System.out.println("go");
                break;
            default:
                System.out.println("a colour that is not a traffic light colour was inputted");
        }*/

        // task2
        System.out.println("Enter a number between 1-12:");
        int num1 = scanner.nextInt();
        switch(num1) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("spring");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("an invalid number was entered");
        }
    }
}
