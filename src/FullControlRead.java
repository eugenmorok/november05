import java.util.Scanner;

public class FullControlRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("your int number: ");
        int number = sc.nextInt();
        //System.out.println((Integer.toBinaryString(number)));

        System.out.print("start index to read: ");
        int idx1 = sc.nextInt();

        System.out.print("end index to read: ");
        int idx2 = sc.nextInt();

        int mask1 = 1;

        int tempForZeroOther = number; // число готово для копирования
        int i = 0;
        while (i < 31) {
            if (i < idx1 | i > idx2) {
                tempForZeroOther = tempForZeroOther & ~(mask1 << i);
                //System.out.println(tempForZeroOther);
                //System.out.println(Integer.toBinaryString(tempForZeroOther));
            }
            i++;
        }

        System.out.printf("the new number is: %d\nthe end!", (tempForZeroOther >> 31 - (31 - idx1)));
    }
}
