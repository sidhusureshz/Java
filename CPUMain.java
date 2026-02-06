import java.util.Scanner;
class CPU {
    double price;

    CPU() {
    }

    CPU(double p) {
        price = p;
    }

    class Processor {
        int no_of_cores;
        String manufacturer;

        Processor() {
        }

        Processor(int n, String m) {
            no_of_cores = n;
            manufacturer = m;
        }
    }

    static class RAM {
        int memory;
        String manufacturer;
        
        RAM() {
        }

        RAM(int n, String m) {
            memory = n;
            manufacturer = m;
        }
    }
}

public class CPUMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CPU cpuObj = new CPU(500);

        CPU.Processor p = cpuObj.new Processor();

        CPU.RAM r = new CPU.RAM();

        System.out.print("Enter processor cores: ");
        p.no_of_cores = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter processor manufacturer: ");
        p.manufacturer = scanner.nextLine();

        System.out.print("Enter RAM memory (GB): ");
        r.memory = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter RAM manufacturer: ");
        r.manufacturer = scanner.nextLine();

        System.out.println("Processor: " + p.no_of_cores + " cores, Manufacturer: " + p.manufacturer);
        System.out.println("RAM: " + r.memory + " GB, Manufacturer: " + r.manufacturer); 
    }
}
