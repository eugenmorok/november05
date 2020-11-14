public class powers {
    public static void main(String[] args) {

        // x^y

        int x = 3;
        int y = 5;
        int memo = x;

        for (; y > 1; y--) {

            memo = memo * x;

        }

        System.out.println(memo);

    }
}



