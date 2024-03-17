import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirstHomework6 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = scaner.nextLine();

        boolean isValid = false;
        if (fileName.endsWith(".txt") || fileName.endsWith(".doc") || fileName.endsWith(".pdf"))
            { isValid = true; }

        if (isValid == true) {
                System.out.println("Valid file extension.");}
            else {
                System.out.println("Invalid file extension.");

        }
    }
}
