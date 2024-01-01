import java.util.Scanner;
/*  Expected output: 
    First Name: Janette              
    Last Name: Tanquis
    Rate per Hour: 350.50
    Hours per Worked: 20
    Gross Pay: Php 7010.00
    Deduction: Php 300.00 
    Net Pay: Php 6,710.00
    DATE: 1/1/24            */

public class TestMsTanquisFloatVerOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Employee Details-----");
        
        System.out.printf("First Name: ");
        String firstName = scanner.nextLine();

        System.out.printf("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.printf("Rate per Hour: ");
        float ratePerHour = scanner.nextFloat();

        System.out.printf("Hours Per Worked: ");
        float hoursPerWorked = scanner.nextFloat();

        float grossPay = ratePerHour * hoursPerWorked;
        float deduction = 300.00f; //NOTE: The deduction is declared already not to be inputed.
        float netPay = grossPay - deduction;

        System.out.println("Gross Pay: Php " + String.format("%.2f", grossPay)); //If the decimal point only has one zero, type String.format("%.2f")
        System.out.println("Deduction: Php " + String.format("%.2f", deduction));
        System.out.println("Net Pay: Php " + String.format("%.2f", netPay));
        
        scanner.close();
        
    }



    
}
