import java.util.Scanner;

public class SimpleCheckPassword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter your password (between 3 and 6 chars): ");
        String password = sc.nextLine();

        if (password.length() < 3 || password.length() > 6) {
            System.out.println("your password must be between 3 and 6 chars");
        } else {

            System.out.print("repeat your password (between 3 and 6 chars): ");
            String repeatPassword = sc.nextLine();


            boolean areEqualPasswords = false;

            if (password.length() == repeatPassword.length()) {

                switch (password.length()) {

                    case 6:
                        if (password.charAt(5) != repeatPassword.charAt(5)) break;
                    case 5:
                        if (password.charAt(4) != repeatPassword.charAt(4)) break;
                    case 4:
                        if (password.charAt(3) != repeatPassword.charAt(3)) break;
                    case 3:
                        if (password.charAt(2) != repeatPassword.charAt(2)) break;
                    case 2:
                        if (password.charAt(1) != repeatPassword.charAt(1)) break;
                    case 1:
                        if (password.charAt(0) == repeatPassword.charAt(0))
                            areEqualPasswords = true;
                        break;

                    default:
                        System.out.println("your passwords are not equal");
                }
            }

            if (areEqualPasswords) System.out.println("your passwords are equal");
            else  System.out.println("your passwords are not equal");

            System.out.println("the end of the program");
        }


    }

}
