import java.util.Scanner;

public class Hello_Name {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.println("Hello "+name);
    }
}
