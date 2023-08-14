import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("**Program to print Fibonacci series upto n term**");
        System.out.print("Enter the n Term: ");
        int n = in.nextInt();

        int n1=0;
        int n2=1;
        int temp = 0;

        System.out.println("Fibonacci Series:- ");
        while(n1<=n){
            System.out.print(n1+" ");
            temp = n2;
            n2 = n1+n2;
            n1 = temp;
        }
    }
}
