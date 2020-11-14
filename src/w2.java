import java.util.Scanner;

public class w2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter ten digits number here: ");
        int d = sc.nextInt();

        int memo = d; // temp var
        int sumNum = 0;
        while (memo != 0) {
            sumNum += memo % 10;
            memo /= 10;
            System.out.println(sumNum);

        }

    }
}
