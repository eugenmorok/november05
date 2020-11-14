import java.util.Scanner;

public class DifferentDigits {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if ((i != j) & (i != k) & (j != k)) {
                        System.out.println(100 * i + 10 * j + 1 * k);
                    } else {
                        System.out.println("a not correct number at this place:))");
                    }
                }
            }
        }


    }
}
