package classroom;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(44, 20));
        int i = calculateSum(10, 2);

        //print "hello world 10 times;

        printTextMultipleTimes("Hello World!", 2);

        //Call methods printAllValues with fruits;
        String[] shop = {"Banana, Milk, Bread, Cucumber"};
        printAllValuesFromStringAway(shop);

        //isEven
        System.out.println(isEven(11));

        //SumArrays
        int [] numbersAray = {2, 5, 7, 8};
        int arraysSum = printSumOfArrays(numbersAray);
        System.out.println(arraysSum);

    }

    public static int calculateSum(int x, int y) {
        int z = x + y;
        return z;
    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }
    //Task crate method that recives String array and print all values

    public static void printAllValuesFromStringAway(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
    //
    public static boolean isEven (int number){
        boolean result = number % 2 == 0;
        return result;
    }
    //Create method that accepts int array and returns summ of number;

    private static int printSumOfArrays (int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }


}
