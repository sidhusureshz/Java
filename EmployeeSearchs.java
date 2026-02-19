import java.util.Scanner;

class Employee {

    int eNo;
    String eName;
    double eSalary;

    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    public void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
        System.out.println("-------------------------");
    }
}

public class EmployeeSearchs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees (N): ");
        int n = sc.nextInt();

        Employee[] arr = new Employee[n];

        System.out.println("\n--- Enter Employee Details ---");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");

            System.out.print("Enter eNo: ");
            int eNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter eName: ");
            String eName = sc.nextLine();

            System.out.print("Enter eSalary: ");
            double eSalary = sc.nextDouble();

            arr[i] = new Employee(eNo, eName, eSalary);
            System.out.println();
        }

        System.out.print("Enter Employee Number to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        System.out.println("\n--- Search Results ---");

        for (int i = 0; i < n; i++) {
            if (arr[i].eNo == searchId) {
                System.out.println("Employee Found!");
                arr[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found!");
        }

        sc.close();
    }
}

