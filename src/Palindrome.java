import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //civic, kayak, tenet
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter word:");
        String word = myScanner.nextLine();

        String iterate = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            iterate = iterate + word.charAt(i);
        }
        if (word.equals(iterate)){
            System.out.println("This word is polindrome");
        } else {
            System.out.println("This word is not a polindrome");
        }

    }
}
