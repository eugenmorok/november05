import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the X value of the sequence members: ");
        int x = sc.nextInt();

        System.out.print("enter number of the sequence members: ");
        int numOfmembers = sc.nextInt();

        double var1 = ((double) (-2) * (double) x) / (double) 3; // a temp variables

        int degree = numOfmembers;

        double var2 = var1; // a temp variables

        // var1^degree

        while (degree > 1) {
            var2 = var2 * var1;
            //System.out.println(memo);
            degree--;
        }

        //System.out.println(var2);

        double sn = 0;

        sn = ((double)1 - var2) / ((double)1 + ((double)2 * (double)x / (double)3));

        System.out.println("the sum of the geometric sequence is: " + sn);
        System.out.println("the end");

    }

}
