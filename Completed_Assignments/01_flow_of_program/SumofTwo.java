import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int c = a+b;

        System.out.println("The Sum of "+a+ " & "+b+" is : "+c);
    }
}
