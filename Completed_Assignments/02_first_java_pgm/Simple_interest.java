import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Principal amount (in years): ");
        int p = in.nextInt();
        System.out.print("Enter the Time: ");
        int t = in.nextInt();
        System.out.print("Enter the Rate of Interest (in %): ");
        int r = in.nextInt();

        int si = (p*r*t)/100;
        int total = si+p;

        System.out.println("Simple Interest: "+si);
        System.out.println("Total amount to be paid included Interest: " +(si+p));
    }
}
