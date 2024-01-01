import java.util.Scanner;

public class ArithmeticOperationComplex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter The First Number:");
        int num1 = scanner.nextInt();

        System.out.printf("Enter The Second Number:");
        int num2 = scanner.nextInt();

        int sum = addNumbers(num1, num2);
        int difference = subtractNumbers(num1, num2);
        int product = multiplyNumbers(num1, num2);
        double quotient = divideNumbers(num1, num2);

        System.out.println("---Output---");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }

    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplyNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public static double divideNumbers(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        } else {
            return (double) num1 / num2;
        }
    }
}