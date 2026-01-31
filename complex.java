import java.util.Scanner;

class Complex {
    double real;
    double imaginary;

    // Default constructor
    Complex() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized constructor
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Addition
    Complex add(Complex c2) {
        Complex result = new Complex();
        result.real = real + c2.real;
        result.imaginary = imaginary + c2.imaginary;
        return result;
    }

    // Subtraction
    Complex sub(Complex c2) {
        Complex result = new Complex();
        result.real = real - c2.real;
        result.imaginary = imaginary - c2.imaginary;
        return result;
    }

    // Multiplication
    Complex multiply(Complex c2) {
        Complex result = new Complex();
        result.real = (real * c2.real) - (imaginary * c2.imaginary);
        result.imaginary = (real * c2.imaginary) + (imaginary * c2.real);
        return result;
    }

    // Display
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the real and imaginary part of first number:");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);

        System.out.println("Enter the real and imaginary part of second number:");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        Complex c2 = new Complex(r2, i2);

        System.out.println("\n--- The Result ---");

        Complex sum = c1.add(c2);
        Complex diff = c1.sub(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.display();

        System.out.print("Difference: ");
        diff.display();

        System.out.print("Product: ");
        prod.display();
    }
}

