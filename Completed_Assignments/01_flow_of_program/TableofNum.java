import java.util.Scanner;

public class TableofNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = in.nextInt();

        System.out.println("Table of the Number:-");
        for(int i=1; i<=10; i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
