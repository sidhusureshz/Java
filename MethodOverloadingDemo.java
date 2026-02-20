import java.util.Scanner;

class Geometry {

    double area(double r) {
        return Math.PI * r * r;
    }

    double area(double l, double b) {
        return l * b;
    }

    double area(double a, double b, double c) {

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid triangle");
            return 0;
        }

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Geometry geo = new Geometry();

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Circle area = " + geo.area(r));

        System.out.print("Enter length and breadth: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Rectangle area = " + geo.area(l, b));

        System.out.print("Enter three sides: ");
        double a = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println("Triangle area = " + geo.area(a, c, d));
    }
}
