import java.util.Scanner;

public class SimpleRecognitionOfSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first element");
        int a1 = sc.nextInt();

        System.out.println("enter second element");
        int a2 = sc.nextInt();

        System.out.println("enter third element");
        int a3 = sc.nextInt();

        boolean areConstan = false;
        boolean areArithmetic = false;
        boolean areGeometric = false;

        if (a1 == a2 && a2 == a3) {
            areConstan = true;
            System.out.println("is Constant");
            for (int i = 0; i < 9; i++) {
                System.out.print(a1);
                if (i != 8) System.out.print(", ");
            }
        } else {

            if ((double) a2 == (((double) a1 + (double) a3) / 2)) {

                areArithmetic = true;
                System.out.println("is Arithmetic");
                int d = a3 - a2; // step of the sequence

                for (int j = -2; j < 7; j++) {

                    System.out.print(a1 + (j - 1) * d);
                    if (j != 6) System.out.print(", ");

                }

            } else if (a2 * a2 == a1 * a3) {

                int memo = 0;

                 System.out.println("is Geometric");

                areGeometric = true;
                double baseQ = a3 / a1;

                //System.out.println("BaseQ is " + baseQ);

                // baseQ^1/2

                baseQ = Math.pow(baseQ, 0.5);

                //System.out.println("BaseQ is " + baseQ);

                double an = 0;

                for (int k = 0; k < 4; k++) {

                    an = a1 / baseQ;
                    //System.out.println((int) an);
                    a1 = (int) an;

                    memo = a1;
                    if (memo == 0) memo = 1; // TODO: доделать по-нормальному
                }

                for (int k = 0; k < 9; k++) {

                    an = memo * baseQ;
                    System.out.print((int) an);
                    memo = (int) an;
                    if (k != 8) System.out.print(", ");

                }

            } else {
                System.out.println("the sequence is not defined");
            }


        }
        System.out.println("\nthe end");
    }
}
