public class geron {

    public static void main(String[] args) {

        // 100^1/6

        float x1 = 4;
        float xadd1 = 0;

        int i = 1;


        while (i < 2000) {

            i++;

            xadd1 = ((float) 1 / (float) 2) * (x1 + ((float) 100 / x1));
            System.out.println(xadd1);

            if (x1 - xadd1 == 0.01) break;
            else x1 = xadd1;



        }

    }
}
