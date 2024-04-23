package HomeWork;

public class HomeWork_1 {
    public static void main(String[] args) {
        //byte
        byte box1 = 10;
        byte box2 = 120;
        String bytePrint = "/Byte print";

        //Print byte
        System.out.println(bytePrint);
        System.out.println("Box 1" + " " + "=" + " " + box1);
        System.out.println("Box 2" + " " + "=" + " " + box2);

        //short
        short box3 = 25;
        short box4 = 137;
        String shortPrint = "/Short print";

        //Short print
        System.out.println(shortPrint);
        System.out.println("Box 3" + " " + "=" + " " + box3);
        System.out.println("Box 4" + " " + "=" + " " + box4);

        //int
        int box5 = 35;
        int box6 = 248;
        String intPrint = "/Int print";

        //int print
        System.out.println(intPrint);
        System.out.println("Box 5" + " " + "=" + " " + box5);
        System.out.println("Box 5" + " " + "=" + " " + box6);

        //long
        long box7 = 72;
        long box8 = 355;
        String longPrint = "/Long print";

        //Long print
        System.out.println(longPrint);
        System.out.println("Box 7" + " " + "=" + " " + box7);
        System.out.println("Box 8" + " " + "=" + " " + box8);
        System.out.println("box 8 - box 7 = ");
        System.out.println(box8 - box7);

        //float
        float currentTempDayLatviaF = 3.2F;
        float currentTempNightLatviaF = -2.7F;

        //float print example in "string print"

        //double
        double currentTempDaySpainD = 21.5;
        double currentTempNightSpainD = 16.7;

        //double print example in "double print"

        //char
        char s = 83;
        char p = 80;
        char a = 65;
        char i = 73;
        char n = 78;

        //Char print
        System.out.println("/Char print");
        System.out.println(s);
        System.out.println(p);
        System.out.println(a);
        System.out.println(i);
        System.out.println(n);

        //sting
        String tempDaySpain = "Current day temperature in Spain";
        String tempDayLatvia = "Current day temperature in Latvia";
        String tempNightSpain = "Current night temperature in Spain";
        String tempNightLatvia = "Current night temperature in Latvia";

        //Sting print + double/float
        System.out.println("/Print string + float/double ");
        System.out.println(tempDayLatvia + " " + currentTempDayLatviaF);
        System.out.println(tempNightLatvia + " " + currentTempNightLatviaF);
        System.out.println(tempDaySpain + " " + currentTempDaySpainD);
        System.out.println(tempNightSpain + " " + currentTempNightSpainD);

        //boolean
        boolean isColdLatvia = true;
        boolean isColdSpain = false;

        //Print boolean
        String isColdLatviaS = "Is cold in Latvia - ";
        String isColdSpainS = "Is colds in Spain - ";
        System.out.println(isColdLatviaS);
        System.out.println(isColdLatvia);
        System.out.println(isColdSpainS);
        System.out.println(isColdSpain);

    }

}
