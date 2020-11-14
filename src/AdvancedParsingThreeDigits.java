import java.util.Scanner;

public class AdvancedParsingThreeDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter three-digit number here: ");
        int x = sc.nextInt();

        int digitsCnt = 0;
        int xx = x;

        while (xx != 0) {
            xx /= 10;
            digitsCnt++;
        }

        if (digitsCnt != 3) {
            System.out.println("there is not a three-digit number");

        } else {

            int number = 0;
            int count = 0;
            //int d = 100;
            int a = 0, b = 0, c = 0;

            int element = 0;
            while (x != 0) {
                element = x % 10;
                x /= 10;
                count++;
                //System.out.println(element);

                switch (count) {
                    case 1:
                        a = element;
                        break;
                    case 2:
                        b = element;
                        break;
                    case 3:
                        c = element;
                        break;
                    default:
                        //System.out.println("some error");
                }

            }

            //System.out.printf("%d, %d, %d\n", a, b, c);
            System.out.println("the minimal number is");

            if (a <= b) {


                if (b <= c) {

                    System.out.printf("%d%d%d\n", a, b, c);

                } else if (a <= c) {
                    System.out.printf("%d%d%d\n", a, c, b);

                } else {
                    System.out.printf("%d%d%d\n", c, a, b);
                }

            } else if (a <= c) {
                System.out.printf("%d%d%d\n", b, a, c);

            } else if (b <= c) {
                System.out.printf("%d%d%d\n", b, c, a);

            } else {
                System.out.printf("%d%d%d\n", c, b, a);
            }


            System.out.println("the maximal number is");

            if (a >= b) {


                if (b >= c) {

                    System.out.printf("%d%d%d\n", a, b, c);

                } else if (a >= c) {
                    System.out.printf("%d%d%d\n", a, c, b);

                } else {
                    System.out.printf("%d%d%d\n", c, a, b);
                }

            } else if (a >= c) {
                System.out.printf("%d%d%d\n", b, a, c);

            } else if (b >= c) {
                System.out.printf("%d%d%d\n", b, c, a);

            } else {
                System.out.printf("%d%d%d\n", c, b, a);
            }
        }
        System.out.println("the end!");


    }
}
