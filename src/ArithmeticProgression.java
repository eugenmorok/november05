import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter first number: ");
        int x = sc.nextInt();

        System.out.print("enter index of the first number: ");
        int idx = sc.nextInt();

        System.out.print("enter second number: ");
        int y = sc.nextInt();

        System.out.print("enter index of the second number: ");
        int idy = sc.nextInt();

        System.out.print("enter start index of the progression: ");
        int id_start = sc.nextInt();

        System.out.print("enter end index of the progression: ");
        int id_end = sc.nextInt();

        int step_value = (x - y) / (idx - idy);

        int number_id1 = x - ((idx - 1 ) * step_value);

        for (int i = id_start; i < id_end; i++) {

            System.out.print(x - ((idx - i ) * step_value) + ", ");

        }

        //System.out.println(number_id1);


    }
}
