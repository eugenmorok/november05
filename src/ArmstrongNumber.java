import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        /*
        Найти все числа Армстронга в int. Число Армстронга - это число, равное сумме степеней цифр,
        из которых оно состоит.  Степени равны размерности (разрядности) числа. Например,
        153 = 1 в кубе + 5 в кубе + 3 в кубе = 1 + 125 + 27. Куб, так как 153 - число трёхразрядное.
         */

        System.out.println("The list of the Armstrong numbers:");

        String numString = "";
        int numLen = 0;

        for (int i = 1; i < 2147483647; i++) {

            int p1 = i / 1000000000;
            int p2 = i / 100000000 % 10;
            int p3 = i / 10000000 % 10;
            int p4 = i / 1000000 % 10;
            int p5 = i / 100000 % 10;
            int p6 = i / 10000 % 10;
            int p7 = i / 1000 % 10;
            int p8 = i / 100 % 10;
            int p9 = i / 10 % 10;
            int p10 = i % 10;

            //System.out.println(p8 + "," + p9 + "," + p10);

            numString = i + "";
            numLen = numString.length();


            int val = 1;
            for (int j = 1; j <= numLen; j++) {
                val = val * p1;
            }
            p1 = val;
            val = 1;
            for (int j2 = 1; j2 <= numLen; j2++) {
                val = val * p2;
            }
            p2 = val;
            val = 1;
            for (int j3 = 1; j3 <= numLen; j3++) {
                val = val * p3;
            }
            p3 = val;
            val = 1;
            for (int j4 = 1; j4 <= numLen; j4++) {
                val = val * p4;
            }
            p4 = val;
            val = 1;
            for (int j5 = 1; j5 <= numLen; j5++) {
                val = val * p5;
            }
            p5 = val;
            val = 1;
            for (int j6 = 1; j6 <= numLen; j6++) {
                val = val * p6;
            }
            p6 = val;
            val = 1;
            for (int j7 = 1; j7 <= numLen; j7++) {
                val = val * p7;
            }
            p7 = val;
            val = 1;
            for (int j8 = 1; j8 <= numLen; j8++) {
                val = val * p8;
            }
            p8 = val;
            val = 1;
            for (int j9 = 1; j9 <= numLen; j9++) {
                val = val * p9;
            }
            p9 = val;
            val = 1;
            for (int j10 = 1; j10 <= numLen; j10++) {
                val = val * p10;
            }
            p10 = val;

            int p0 = p1 + p2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p10;

            if (i == p0) {
                //System.out.println(p8 + "," + p9 + "," + p10);
                System.out.println(i);
                //System.out.println(numLen);
            }
            //System.out.println(i);
            //System.out.println(p0);

        }

        System.out.println("The end of the program");

    }
}
