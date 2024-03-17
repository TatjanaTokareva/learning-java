import java.util.Scanner;

public class FirstHomework3 {
    public static void main(String[] args) {
        //BMI calculator:
        Scanner myScaner1 = new Scanner(System.in);

        System.out.println("Please enter your weight in kilograms:");
        double weight = myScaner1.nextDouble();

        System.out.println("Please enter your height in meters");
        double height = myScaner1.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI is: " + bmi);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal";
        } else if (bmi < 29.9) {
            category = "Over weight";
        } else {
            category = "Obese";
        }

        System.out.println("Your category is: " + category);
    }
}