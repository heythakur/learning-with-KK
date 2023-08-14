import java.util.Scanner;

public class Largest_of_2_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two Numbers:-");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        if(n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }
        else {
            System.out.println(n2+" is greater than "+n1);
        }
    }
}
