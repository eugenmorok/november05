import java.util.Scanner;

public class LinearCongruentMethodOfRandomNumbersGenerationWithParsing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("x0");
        int x0 = sc.nextInt();

        System.out.println("k");
        int k = sc.nextInt();

        System.out.println("b");
        int b = sc.nextInt();

        System.out.println("length of the sequence");
        int lenSequence = sc.nextInt();

        int i = 0;
        while (i < lenSequence) {

            // k * x0 + b
            int NumToPars = k * x0 + b;
            //System.out.printf("k * x0 + b = %d", NumToPars);

            // sum(NumToPars)elements

            int memo = NumToPars;
            int sumNumToPars = 0;
            while (memo != 0) {
                sumNumToPars += memo % 10;
                memo /= 10;
            }
            //System.out.printf("\nSum elements of the %d is %d", NumToPars, sumNumToPars);

            int nextGenN = sumNumToPars % 100;

            //System.out.println("\nNext number is " + nextGenN);
            System.out.print(nextGenN);
            if (i != lenSequence - 1) System.out.print(", ");

            x0 = nextGenN;

            i++;
        }

        System.out.println("\nthe end");

    }

}
