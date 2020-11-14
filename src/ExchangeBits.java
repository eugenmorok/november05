import java.util.Scanner;

public class ExchangeBits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number for change: ");
        int a1 = sc.nextInt();

        System.out.print("Enter a second number for change: ");
        int a2 = sc.nextInt();

        System.out.print("Enter a first bit index to change it: ");
        int idx1 = sc.nextInt();

        System.out.print("Enter a second bit index to change it: ");
        int idx2 = sc.nextInt();

        //------------------------------------------------------------------------------------

        int mask1 = 1;

        int tempForZeroOtherA1 = a1; // число готово для переноса из 1го числа
        int i = 0;
        while (i < 31) {
            if (i < idx1 | i > idx2) {
                tempForZeroOtherA1 = tempForZeroOtherA1 & ~(mask1 << i);
                //System.out.println(tempForZeroOtherA1);
            }
            i++;
        }


        int tempForZeroOtherA2 = a2; // число готово для переноса из 2го числа
        int j = 0;
        while (j < 31) {
            if (j < idx1 | j > idx2) {
                tempForZeroOtherA2 = tempForZeroOtherA2 & ~(mask1 << j);
                //System.out.println(tempForZeroOtherA2);
            }
            j++;
        }

        //------------------------------------------------------------------------------------

        int tempForZeroA1 = a1; // блок подготовлен из 1го числа
        int k = idx1;
        while (k < idx2 + 1) {
            tempForZeroA1 = tempForZeroA1 & ~(mask1 << k);
            //System.out.println(tempForZeroA1);
            k++;
        }


        int tempForZeroA2 = a2; // блок подготовлен из 2го числа
        int t = idx1;
        while (t < idx2 + 1) {
            tempForZeroA2 = tempForZeroA2 & ~(mask1 << t);
            //System.out.println(tempForZeroA2);
            t++;
        }


        //------------------------------------------------------------------------------------


        System.out.println("The first number after change is: " + (tempForZeroA1 | tempForZeroOtherA2));
        System.out.println("The second number after change is: " + (tempForZeroA2 | tempForZeroOtherA1));
        System.out.println("The end!");

    }
}
