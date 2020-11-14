import java.util.Scanner;

public class roots_exp1 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int x = sc.nextInt();

        System.out.print("enter index of the first number: ");
        int idx = sc.nextInt();

        System.out.print("enter second number: ");
        int y = sc.nextInt();

        System.out.print("enter index of the second number: ");
        int idy = sc.nextInt();

        System.out.print("enter start index of the progression: ");
        int id_start = sc.nextInt();

        System.out.print("enter end index of the progression: ");
        int id_end = sc.nextInt();

        // block 1

        // looking for to q

        int aDegreeOfRoot = 0;
        aDegreeOfRoot = idy - idx;

        int baseOfRoot = 0;
        baseOfRoot = y / x;

        int number = baseOfRoot;

        int i = 0;
        boolean isWholeSquare = false;

        int memo = 0;


        while (memo < number) {

            i++;


            // x^y

            memo = i;

            for (; y < aDegreeOfRoot ; y++) {

                memo = memo * i;
            }


        }


        if (memo == number) {

            System.out.println(i);
            isWholeSquare = true;
            System.out.println(isWholeSquare);

        } else {

            System.out.printf("between %d and %d \n", i - 1, i);
            System.out.println(isWholeSquare);

        }


    }

}
