import java.util.Scanner;

public class FirstHomework4 {
    public static void main(String[] args) {
        //Calculates the final grade

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Math score: ");
        int mathScore = scanner.nextInt();

        System.out.print("Enter Science score: ");
        int scienceScore = scanner.nextInt();

        System.out.print("Enter English score: ");
        int englishScore = scanner.nextInt();

        double averageScore = (mathScore + scienceScore + englishScore) / 3.0;

        String finalGrade;
        if (averageScore >= 90) {
            finalGrade = "A";
        } else if (averageScore >= 80) {
            finalGrade = "B";
        } else if (averageScore >= 70) {
            finalGrade = "C";
        } else if (averageScore >= 60) {
            finalGrade = "D";
        } else {
            finalGrade = "F";
        }

        System.out.println("Average score: " + averageScore);
        System.out.println("Final grade: " + finalGrade);
    }
}