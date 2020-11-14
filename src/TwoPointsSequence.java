import java.util.Scanner;

public class TwoPointsSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("first main element");
        int a1 = sc.nextInt();

        System.out.println("second main element");
        int a2 = sc.nextInt();

        System.out.println("first multiplier");
        int m1 = sc.nextInt();

        System.out.println("second multiplier");
        int m2 = sc.nextInt();

        System.out.println("numbers of the elements");
        int number = sc.nextInt();

        int nextElement = 0;

        int i = 0;

        if (number > 2) {
            System.out.print(a1 + ", " + a2 + ", ");

            while (i < number - 2) {

                nextElement = ((a1 * m1) + (a2 * m2));

                a1 = a2;
                a2 = nextElement;
                System.out.print(nextElement);
                if (i != number - 3) System.out.print(", ");

                i++;
            }
        } else {
            if (number == 2) {
                System.out.print(a1 + ", " + a2);
            } else {
                System.out.print(a1);
            }
        }


    }
}
