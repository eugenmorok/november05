import java.util.Scanner;

public class Root {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number to find the root: ");
        int baseNumber = sc.nextInt();


        int k = 0;
        boolean isWholeSquare = false;
        //int memo = 0;

        while (k * k < baseNumber) {
            k++;
        }

        if (k * k == baseNumber) {

            System.out.println(k);
            isWholeSquare = true;
            //System.out.println(isWholeSquare);

            System.out.print("is the number whole square?: ");
            System.out.println(isWholeSquare);

        } else {

            System.out.printf("the value of the root between %d and %d \n", k - 1, k);
            System.out.print("is the number whole square?: ");
            System.out.println(isWholeSquare);

        }

    }
}
