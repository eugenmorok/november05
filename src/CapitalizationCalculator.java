import java.util.Scanner;

public class CapitalizationCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("to calculate the capitalization of the deposit, enter the values: ");

        System.out.print("amount of the deposit(RUB): ");
        double amountOfDeposit = (double) sc.nextInt();

        System.out.print("percent tax of the deposit(%): ");
        double tax = sc.nextDouble() / 100;

        System.out.print("the number of all years of the deposit: ");
        int fullYears = sc.nextInt();

        for (int i = 1; i < fullYears + 1; i++) {

            amountOfDeposit += amountOfDeposit * tax;
        }

        System.out.printf("the capitalization of the deposit " +
                "is %d.%d RUB \nthe end", (int) amountOfDeposit, (int) (amountOfDeposit % 1 * 100));


    }
}
