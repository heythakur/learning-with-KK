import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = in.nextInt();

        //counting the number of digits in the inputed number.
        int digits = 1;
        for (int i=10; num!=num%i; i=i*10) {
            digits++;
        }

        int temp = num;     // storing the number in temprory variable.
        int new_num =0;     // new number to count and add all the squares.
        int d1 = 0;         // it will represent the last digit of the number.

        for(int i=1; i<=4; i++){
            d1 = temp%10;
            temp = temp / 10;
            new_num = (int) (new_num + (Math.pow(d1, digits)));
        }

        if(new_num==num){
            System.out.println("It is a Palindrome Nubmer.");
        }
        else {
            System.out.println("It is not a Palindrome Nubmer.");
        }
    }
}
