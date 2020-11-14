import java.util.Scanner;

class gmprog{

    static Scanner in = new Scanner (System.in);

    public static void main  (String[] args){

        System.out.println("\n\tStart programm\n");

        //AS1 = Enter 1 element of the geometrical progression
        System.out.print("Enter 1 element of the geometrical progression: ");
        int GP1 = in.nextInt();//4

        System.out.print("Enters the number of this item: ");
        int Nomer1 = in.nextInt();//2

        System.out.print("Enter 2 element of the geometrical progression: ");
        int GP2 = in.nextInt();//16

        System.out.print("Enters the number of this item: ");
        int Nomer2 = in.nextInt();//4

        System.out.print("Enter the number of the element from which you want to display the progression: ");
        int NomerStart = in.nextInt();

        System.out.print("Enter the number to which you want to output: ");
        int NomerEnd = in.nextInt();


        //q - denominator of geometric progression, b1 - 1 element geometrical progression
        double q = Math.pow(GP2/GP1,1.0 / (Nomer2 - Nomer1)) ; //
        double b1 = GP2 / (Math.pow (q ,Nomer2-1));


        if ((NomerEnd + 1) > NomerStart){
            System.out.print("\nSequence of " + NomerStart + " to " + NomerEnd + " = " );
            for (int i = NomerStart ; i < (NomerEnd + 1);i++){

                double Sequence = b1 * (Math.pow (q ,i-1)) ;

                System.out.print(Sequence + " ");

            }
        }

        else System.out.println("\nWrong entry, try again\n");


        System.out.println("\n\tFinish programm");

    }


}
