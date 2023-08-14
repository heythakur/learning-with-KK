import java.text.DecimalFormat;
import java.util.Scanner;

public class RupeesToDollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Amount (in Rupees): ");
        float inr = in.nextFloat();

        float usd = (float) (inr/82.96);

        //rounding of the after two decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(inr+" INR is "+df.format(usd)+" USD.");
    }
}
