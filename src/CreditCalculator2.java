import java.util.Scanner;

public class CreditCalculator2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("to calculate the result, please enter your values right here ");

        System.out.print("the amount of the your credit(RUR): ");
        double amountOfCredit = sc.nextDouble();

        System.out.print("the month tax of the your credit(%): ");
        double monthTax = sc.nextDouble() / 100;

        System.out.print("the month payment of the your credit(RUR): ");
        double monthPay = sc.nextDouble();

        double monthPercentAmount = 0.0;
        double monthBodyAmount = 0.0;
        int monthToCreditClose = 0;
        double overPay = 0.0;
        double payAmount = 0.0;
        double lastPay = 0.0;
        double startAmount = amountOfCredit;

        while (amountOfCredit > 0.0) {

            monthPercentAmount = amountOfCredit * monthTax;
            overPay += monthPercentAmount;

            monthBodyAmount = monthPay - monthPercentAmount;

            monthToCreditClose++;

            amountOfCredit -= monthBodyAmount;

        }

        if (amountOfCredit < 0.0) {
            lastPay = monthPay + amountOfCredit;
        }

        payAmount = overPay + startAmount;

        //System.out.println(amountOfCredit + " " + monthToCreditClose + " " + overPay + " " + payAmount + " " + lastPay);

        System.out.print("your result here: \n");
        System.out.println("the month number of the credit close is " + monthToCreditClose);
        System.out.println("the amount of the overpay is " + (int)overPay);
        System.out.println("the amount of the total payment is " + (int)payAmount);
        System.out.println("the last payment value is " + (int)lastPay + "\nthe end");

        sc.close();


    }
}
