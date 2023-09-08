package Variables;
import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        //extenxion task
        //task1
       /* String firstName = "Stephanie";
        String lastName = "Estrada Garcia";
        String name = firstName + " " + lastName;
        System.out.println(name); */
        //task2
        /*int num1 = 1;
        int num2 = 2;
        System.out.println(num1 +num2);
        float result = (float)num1/num2;
        System.out.println(result);
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(++num3);*/
        //task3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.next();

        System.out.println("Enter your last name:");
        String lastName = scanner.next();

        System.out.println("Greetings " + firstName +" " + lastName);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter a number you want to add:");
        int number2 = scanner.nextInt();

        System.out.println("Sum = " + (number1 + number2));

    }
}
