import java.util.Scanner;

/*
Принять переменную типа int от пользователя. Далее пользователь указывает начало и конец блока битов,
который он хочет изменить, и сигнатуру битов в виде числа, на которое он хочет переписать блок.
Биты считаются от 0 до 31 справа налево.

Например, введённый носитель 19 (10011), начало блока битов 1, конец - 3, то есть блок из 3 битов, что означает,
что сигнатура битов в виде числа может быть от 0 до 7. Допустим пользователь ввёл 6 (110).
Тогда должно получиться 29 (11101).

 */
public class FullControlWrite {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a base number here: ");
        int baseNumber = sc.nextInt();

        System.out.print("start index to read: ");
        int idx1 = sc.nextInt();

        System.out.print("end index to read: ");
        int idx2 = sc.nextInt();

        //------------------------------------------------

        int mask1 = 1;

        int tempForZero = baseNumber; // блок подготовлен for injection
        int k = idx1;
        while (k < idx2 + 1) {
            tempForZero = tempForZero & ~(mask1 << k);
            //System.out.println(tempForZero);
            //System.out.println(Integer.toBinaryString(tempForZero));
            k++;
        }

        //------------------------------------------------

        // the range for an injection number

        int y = idx2 - idx1 + 1;
        int memo = 2; // temp var
        while (y > 1) {

            memo *= 2;
            //System.out.println(memo);
            y--;
        }

        int range = memo - 1;

        //------------------------------------------------

        System.out.printf("enter a number for injection in range 0 to %d: ", range);
        int intoNumber = sc.nextInt() << idx1;

        System.out.printf("your ne number is: %d\nthe end!", tempForZero | intoNumber);


    }
}
