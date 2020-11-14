import java.util.Scanner;

public class Power {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // x^y
        System.out.println("enter the base number: ");
        long x = sc.nextLong();

        System.out.println("enter the degree number: ");
        long y = sc.nextLong();

        long memo = x;

        while (y > 1) {

            memo = memo * x;
            //System.out.println(memo);
            y--;

        }
        System.out.println("the result is " + memo);
        System.out.println("the end");
    }


}
