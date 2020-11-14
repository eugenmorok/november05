import java.util.Scanner;

public class Divisors {

/*
Пользователь вводит три числа. Первые два - границы диапазона,
третье - количество делителей у чисел, которые нужно вывести, кроме 1 и самого числа.
Например, ввод 3, 20 и 3. Тогда вывод 16 (3 делителя: 2, 4, 8)
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number for range: ");
        int start = sc.nextInt();

        System.out.print("Enter last number for range: ");
        int end = sc.nextInt();

        System.out.print("Enter the count of divisors: ");
        int divisors = sc.nextInt();

        int count = 0;
 //     int memo = start;

        for (; start + 1 < end; start++) {
            count = 0;

            for (int i = 2; i < start ; i++) {
                if (start % i == 0 & i != start) {
                    count++;
                    //System.out.println(count);
                }
            }
            if (count == 3) System.out.println(start);


        }

        System.out.println("The end");
    }
}
