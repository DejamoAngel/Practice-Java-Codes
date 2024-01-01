import java.util.Scanner;

public class TestMsTanquisFloatVerTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Employee Details----- ");
        
        System.out.printf("First Name: ");
        String firstName = scanner.nextLine();

        System.out.printf("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.printf("Rate per Hour: ");
        float ratePerHour = scanner.nextFloat();

        System.out.printf("Hours Per Worked: ");
        float hoursPerWorked = scanner.nextFloat();

        System.out.printf("Deduction: ");
        float deduction = scanner.nextFloat();

        float grossPay = ratePerHour * hoursPerWorked;
        float netPay = grossPay - deduction;
        // NOTE: In this another version of code, the user can input the deduction

        System.out.println("Gross Pay: Php " + String.format("%.2f", grossPay)); //If the decimal point only has one zero, type String.format("%.2f")
        System.out.println("Deduction: Php " + String.format("%.2f", deduction));
        System.out.println("Net Pay: Php " + String.format("%.2f", netPay));
        
        scanner.close();
        
    }
    
}
