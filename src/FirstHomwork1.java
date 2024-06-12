import java.util.Scanner;

public class FirstHomwork1 {
    public static void main(String[] args) {
        // Character type identifier:
        Scanner myScaner = new Scanner(System.in);
        System.out.println("Please enter character: ");
        char ch = myScaner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Volwer");
        } else {
            System.out.println("Not Volwer");
        }
    }
}
