import java.util.Scanner;

public class Input_Till_X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers (or 'x' to exit):-");

        String input="y";
        int total =0;
        int num;

        while (!input.equals("x")){
            input = in.next();

            if (!input.equals("x")) {
                num = Integer.parseInt(input);
                total = total + num;
            }
            else {
                break;
            }
        }

        System.out.println("Sum of all the inputs: "+ total);
    }
}
