import java.util.Scanner;

public class HappyTenDigitsNumbersWithoutCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter ten digits number here: ");
        int d = sc.nextInt();

        int memo = d; // temp var
        int sumNum = 0;
        int i = 1;

        while (memo != 0) {

            sumNum += memo % 10;
            memo /= 10;
           // System.out.println(sumNum);
            i++;
            if (i > 5) break;

        }

        int memo2 = d; // temp var
        int Num2 = 0;
        int j = 1;
        int sumNum2 = 0;

        while (memo2 != 0) {
            j++;
            Num2 = memo2 % 10;
            memo2 /= 10;
            if (j > 6) {
                sumNum2 += Num2;
            }

            //System.out.println("f " + sumNum2);
        }

        if (sumNum == sumNum2) System.out.println("This is the Happy Number");
        else System.out.println("This is NOT the Happy Number");;
        System.out.println("the end!");

    }
}
