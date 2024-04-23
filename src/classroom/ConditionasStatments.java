package classroom;

public class ConditionasStatments {
    public static void main(String[] args) {

        if (true) {
            System.out.println("This code is executed");
        }
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        if (x > 12) {
            System.out.println("x is freater than 12");
        }
        boolean isSpring = true;
        if (isSpring) {
            System.out.println("It is spring!");
        }

        int age = 25;

        if (age <= 12) {
            System.out.println("This is child!");
        } else {
            System.out.println("Something else!");
        }

        if (age <= 12) {
            System.out.println("This is child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is teanager");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is adult!");
        } else {
            System.out.println("This is senior!");
        }

        int number = 17;
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is neither positive nor negative");
        }

        int hours = 13;
        if (hours >= 0 && hours <= 11) {
            System.out.println("Good morning");
        } else if (hours >= 12 && hours <= 17) {
            System.out.println("Good afternoon");
        } else if (hours >= 18 && hours <= 23) {
            System.out.println("Good evening");
        } else {
            System.out.println("Invalid hour prov");
        }
    }
}




