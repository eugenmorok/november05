public class roots_tegree3_final {
    /* корень между двумя целыми числами методом перебора */

    public static void main(String[] args) {

        int number = 728;
        int degree = 6;

        int k = 0;
        boolean isWholeSquare = false;
        int memo = 0;


        while (k*k*k < number) {

            k++;

        }


        if (k*k*k == number) {

            System.out.println(k);
            isWholeSquare = true;
            System.out.println(isWholeSquare);

        } else {

            System.out.printf("between %d and %d \n", k - 1, k);
            System.out.println(isWholeSquare);

        }


    }

}
