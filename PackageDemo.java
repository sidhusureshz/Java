import java.util.Scanner;
import mathutils.Calculator;

public class PackageDemo{
@SuppressWarnings("ConvertToTryWIthResources")
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
Calculator calc = new Calculator();

        System.out.println("User Defined Package Demonstration");

        System.out.print("Enter first operand: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second operand: ");
        double num2 = sc.nextDouble();

        System.out.println("\nResults");

        System.out.printf("Addition: %.2f\n", calc.add(num1, num2));
        System.out.printf("Subtraction: %.2f\n", calc.subtract(num1, num2));
        System.out.printf("Multiplication: %.2f\n", calc.multiply(num1, num2));
        if(num2==0){
        System.out.println("Unable to divide with zero!!");
        }
        else
        {
        System.out.printf("Division: %.2f\n", calc.divide(num1, num2));
        }
        sc.close();
    }
}

