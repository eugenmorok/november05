import java.util.Scanner;

public class Logarithm {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));

        System.out.print("enter number of logarithm: ");
        int b = sc.nextInt();

        System.out.print("enter logarithm base here: ");
        int a = sc.nextInt();

        int result = 1;
        int cnt = 0;

        while (result < b) {

            result = result * a;
            cnt++;

        }

        System.out.printf("the value of logarithm is between %d and %d\nthe end!", cnt - 1, cnt);
    }
}
