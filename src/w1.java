public class w1 {
    public static void main(String[] args) {
        int k = 12345; int x =k;
        int s = 0;
        while (x != 0 ){
            s +=x%10;
            x /=10;
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);
    }

}