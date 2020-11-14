import java.util.Scanner;
/*
Изменить определённый бит, который укажет пользователь (от 0 до 31), в int-овой переменной.
Остальные оставить без изменений. Считаем биты справа налево, то есть младший бит - это нулевой.
Изменить означает, что если он равен 0, то он должен стать 1 и наоборот.
 */
public class ChangeBit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for change: ");
        int val = sc.nextInt();

        System.out.print("Enter bit number to change it: ");
        int number = sc.nextInt();

        System.out.println("The result is " + (val ^ (1 << number)));
        System.out.println("The end!");
    }
}
