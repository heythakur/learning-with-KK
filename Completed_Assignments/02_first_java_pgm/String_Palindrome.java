import java.util.ArrayList;
import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String input = in.next();

        int l = input.length();             //length of the inputed string.

        char[] charArray = new char[l];    // creating a new charArray of same length.

        //storing the reverse of inputed string into charArray.
        for (int i =0, j=l-1; i<l; i++, j--){
            charArray[i] = input.charAt(j);
        }

        //converting the charArray into the String str.
        String str = new String(charArray);

        //comparing the inputed string with the reversed string.
        if(str.equals(input)){
            System.out.println(input+" is Palindrome");
        }
        else{
            System.out.println(input+" is not a Palindrome");
        }
    }
}
