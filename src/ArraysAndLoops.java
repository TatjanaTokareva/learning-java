import java.util.Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {

        //Array
        //Bread, Milk, Eggs, Fruits;

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        int[] grades = {7, 9, 10, 6, 5, 4};

        String[] seasons = {"Summer", "Winter", "Autumn", "Spring"};

        String eggs = shoppingList[2];
        System.out.println(eggs);

        System.out.println(grades[4]);

        //change arrays
        grades[0] = 2;
        System.out.println(grades[0]);

        //print all arrays
        System.out.println(Arrays.toString(grades));

        //Create empty array
        int[] emptyArray = new int[4];
        //[0] [0] [0] [0]
        System.out.println(Arrays.toString(emptyArray));

        //change arrays
        emptyArray[0] = 1;
        emptyArray[1] = 2;
        emptyArray[2] = 3;
        emptyArray[3] = 4;
        System.out.println(Arrays.toString(emptyArray));

        //Create arrays Sting with names
        //Name count 5 names

        String[] names = {"Maria", "Tanya", "Inna", "Oleg", "Seva"};
        System.out.println(Arrays.toString(names));

        //Empty arrays wit 5 size;
        //print empty array
        //update
        //print

        double[] emptyArrayDouble = new double[5];
        System.out.println(Arrays.toString(emptyArrayDouble));
        emptyArrayDouble[0] = 1.1;
        emptyArrayDouble[1] = 2.2;
        emptyArrayDouble[2] = 3.3;
        emptyArrayDouble[3] = 4.4;
        emptyArrayDouble[4] = 5.5;

        System.out.println(Arrays.toString(emptyArrayDouble));

        //loop
        //print nubmers 0 to 10

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        //create sum from 1 to 100
        //example 1+2+3+n;

        int summa = 0;
        for (int i = 1; i <= 100; i++) {
            summa = summa + i;
        }
        System.out.println("Sum:" + summa);

        //arrays with loops (for)

        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println(shoppingList[i]);
        }
        for (String s : shoppingList) {
            System.out.println(s);
        }

        //print from 10 to 0

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int counter = 10;
        while (counter >= 0) {
            counter = counter - 1;
        }

        //print even numbers 2 to 100
        //print in one line

        int counter1 = 100;
        while (counter1 >= 2) {
            counter1 = counter1 - 2;
                System.out.print(counter1 + " ");
            }

            for (int i = 2; i <=100; i++){
                if (i % 2 == 0){
                    System.out.print(i + " ");
                }
            }

        }


    }

