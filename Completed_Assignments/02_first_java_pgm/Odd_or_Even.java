import java.util.Scanner;

public class Odd_or_Even {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the Number: ");
        int num = in.nextInt();

        if(num%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
