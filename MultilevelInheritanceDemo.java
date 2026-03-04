import java.util.Scanner;

class Person {
    String name;
    String gender;
    String address;
    int age;

    public Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }

    public void display() {
        System.out.println("Name       : " + name);
        System.out.println("Gender     : " + gender);
        System.out.println("Address    : " + address);
        System.out.println("Age        : " + age);
    }
}

class Employee extends Person {
    int empId;
    String companyName;
    String qualification;
    double salary;

    public Employee(String name, String gender, String address, int age,
                    int empId, String companyName, String qualification,
                    double salary) {
        super(name, gender, address, age);
        this.empId = empId;
        this.companyName = companyName;
        this.qualification = qualification;
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Employee ID: " + empId);
        System.out.println("Company    : " + companyName);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary     : " + salary);
    }
}

class Teacher extends Employee {
    String subject;
    String department;
    int teacherId;

    public Teacher(String name, String gender, String address, int age,
                   int empId, String companyName, String qualification,
                   double salary,
                   String subject, String department, int teacherId) {
        super(name, gender, address, age, empId, companyName, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacherId = teacherId;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Teacher ID : " + teacherId);
        System.out.println("Subject    : " + subject);
        System.out.println("Department : " + department);
        System.out.println("----------------------------------------");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of teachers (N): ");
        int n = sc.nextInt();

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter Details for Teacher " + (i + 1) + " ---");
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();

            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Company Name: ");
            String companyName = sc.nextLine();
            System.out.print("Qualification: ");
            String qualification = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            sc.nextLine();
            System.out.print("Teacher ID: ");
            int teacherId = sc.nextInt();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();
            System.out.print("Department: ");
            String department = sc.nextLine();

            teachers[i] = new Teacher(
                    name, gender, address, age,
                    empId, companyName, qualification, salary,
                    subject, department, teacherId
            );
        }

        System.out.println("\n========================================");
        System.out.println(" TEACHER RECORDS");
        System.out.println("========================================");

        for (Teacher t : teachers) {
            t.display();
        }
    }
}
