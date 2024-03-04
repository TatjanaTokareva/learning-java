public class DataTypes {
    public static void main(String[] args) {
        //First comment
        /* Hello
        Second comment
        Please don't delete
         */
        //Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        //Variables: double
        double temperature = 17.5;
        double price = 999.99;
        System.out.println(temperature);
        System.out.println(price);

        //Variables: float

        float pi = 3.14F;
        float radius = 5.5F;
        float area = pi * radius * radius;
        System.out.println(area);

        //Casting
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        //Char
        char symbol = '$';
        System.out.println(symbol);

        //Exercise:
        char t = 84;
        System.out.println(t);
        char a = 65;
        System.out.println(a);
        System.out.println(t);
        char j = 74;
        System.out.println(j);
        System.out.println(a);
        char n = 78;
        System.out.println(n);
        System.out.println(a);

        //Boolean is/has (returns true or false)
        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);
    }
}
