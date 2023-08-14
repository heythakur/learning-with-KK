import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int n2 = in.nextInt();

        System.out.print("Enter the Operation to be performed (+,-,*,/): ");
        String op = in.next();

        if(op.equals("+")){
            System.out.println("Addition of "+n1+" & "+n2+" is: "+ (n1+n2));
        }
        else if(op.equals("-")){
            System.out.println("Subtraction of "+n1+" & "+n2+" is: "+ (n1-n2));
        }
        else if(op.equals("*")){
            System.out.println("Multiplication of "+n1+" & "+n2+" is: "+ (n1*n2));
        }
        else if(op.equals("/")){
            System.out.println("Division of "+n1+" & "+n2+" is: "+ (n1/n2));
        }
    }
}
