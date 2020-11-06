import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("To check if your number is a Fibonacci number enter it here: ");
        int num = sc.nextInt();

        if (num == 1) System.out.printf("Yes, the %d is a Fibonacci number\n", num);
        else {

            int first = 1;
            int second = 1;
            //int a = 0;
            //int b = 0;

            int memo = 0;

            while (memo < num) {
                memo = first + second;
                first = second;
                second = memo;

            }

            if (num == second) System.out.printf("Yes, the %d is a Fibonacci number\n", num);
            else System.out.printf("No, the %d is not a Fibonacci number\n", num);
        }
        System.out.println("The end");
    }
}
