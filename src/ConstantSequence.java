import java.util.Scanner;

public class ConstantSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter step: ");
        int step = sc.nextInt();

        System.out.println("enter values: ");

        String line = "";
        String outLine = "";
        String values = "";

        for (int i = 0; i < step + 1; i++) {

            values = sc.nextLine();
            line = line + values;
            if (i > 0 && i < step) {
                line += ", ";
            }
        }

        System.out.print("enter repeat: ");
        int repeat = sc.nextInt();

        for (int j = 0; j < repeat; j++) {

            if (j > 0) {
                outLine = outLine + ", ";
            }
            outLine = outLine + line;
        }
        System.out.println(outLine);
        System.out.println("the end");
    }
}
