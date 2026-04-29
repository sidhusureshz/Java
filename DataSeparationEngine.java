import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataSeparationEngine {
public static void main(String[] args) {

File inputFile = new File("numbers.txt");
File evenFile = new File("even.txt");
File oddFile = new File("odd.txt");

System.out.println("-> Initiating Tokenization Sequence...");

try (
Scanner sc = new Scanner(inputFile);
PrintWriter evenWriter = new PrintWriter(evenFile);
PrintWriter oddWriter = new PrintWriter(oddFile)
        ) {

            int count = 0;

            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                count++;

                if (number % 2 == 0) {
                    evenWriter.println(number);
                } else {
                    oddWriter.println(number);
                }
            }

System.out.println("Result: Successfully processed " + count + " integers.");
System.out.println("Output routed to 'even.txt' and 'odd.txt'.");

} catch (FileNotFoundException e) {
System.err.println("FATAL I/O ERROR: 'numbers.txt' not found.");
System.err.println("Fix: You must manually create 'numbers.txt' in the project directory and populate it with integers.");
        }
    }
}
