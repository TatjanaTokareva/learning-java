import java.util.Scanner;

public class FirtHomeWork {
    public static void main(String[] args) {
        //1 Easy peasy:
        Scanner myScaner1 = new Scanner(System.in);
        System.out.println("Please enter number:");
        int input1 = myScaner1.nextInt();

        if (input1 > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }

        //Odd or even:
        if (input1 % 2 == 0) {
            System.out.println("Is even");
        } else {
            System.out.println("Is odd");
        }

        //Age group classifier:
        if (input1 >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Teenager");
        }

        //Leap year checker:
        if (input1 % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not leap year");
        }

        //Multiple conditions:
        if (input1 > 0 && input1 < 100 && input1 % 2 == 0) {
            System.out.println("Valid number");
        } else {
            System.out.println("Non valid number");
        }

        //Nested conditions:
        if (input1 > 0) {
            if (input1 % 2 == 0) {
                System.out.println("Positive and Even");
            } else {
                System.out.println("Not positive and Even ");
            }
        }
    }
}
