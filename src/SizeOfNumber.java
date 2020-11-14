import java.util.Scanner;

public class SizeOfNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int anyNumber = sc.nextInt();

        int count = 0;

        while (anyNumber != 0) {
            anyNumber /= 10;
            count++;
        }

        System.out.printf("the number has %d digits\nthe end!", count);
    }

}