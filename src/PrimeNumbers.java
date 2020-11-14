import java.util.Scanner;

public class PrimeNumbers {

/*
Пользователь вводит два числа.
Вывести все простые числа из введённого диапазона
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number for range: ");
        int start = sc.nextInt();

        System.out.print("Enter last number for range: ");
        int end = sc.nextInt();

        int count = 0;

        for (; start < end + 1; start++) {
            count = 0;

            for (int i = 2; i < start + 1; i++) {
                if (start % i == 0) {
                    count++;
                }
            }

            if (count < 2 && start > 1) System.out.println(start);

        }

        System.out.println("The end");
    }
}
