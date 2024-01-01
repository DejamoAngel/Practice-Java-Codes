import java.util.Scanner;

public class ArithmeticOperationSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.printf("Enter The First Number: ");
        int num1 = scanner.nextInt();

        System.out.printf("Enter The Second Number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        double division = num1 / num2;

        System.out.println("Output:");
        System.out.println("Sum: " + sum );
        System.out.println("Subtract: " + subtract );
        System.out.println("Multiplication: " + multiply );
        System.out.println("Division: " + division );

        scanner.close();
    }
    
}
