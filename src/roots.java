public class roots {
    /* корень между двумя целыми числами методом перебора */

    public static void main(String[] args) {

        //728scrt6
        int numberBaseOfRoot = 728;
        int degreeOfRootEntered = 6;

        int i = 0, m = 0;

        i = 2;
        m = i;


        // i^degreeOfRoot

        for (int j = 1; j < degreeOfRootEntered; j++) {

            i = i * m;
            System.out.println("i = " + i);

        }

        System.out.println("i f = " + i);

        // roots

        int k = 1;
        boolean isWholeSquare = false;
        int memo = 0;


        while (k < numberBaseOfRoot) {

            m = k;

            for (int j = 1; j < degreeOfRootEntered; j++) {

                k = k * m;
                System.out.println("k = " + k);

            }

            k++;


        }


        if (k == numberBaseOfRoot) {

            System.out.println(k);
            isWholeSquare = true;
            System.out.println(isWholeSquare);

        } else {

            System.out.printf("between %d and %d \n", k - 1, k);
            System.out.println(isWholeSquare);

        }


    }

}
