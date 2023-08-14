import java.util.Scanner;

public class LCMandHCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input Number: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int temp1=num1;
        int temp2=num2;
        int temp =0;

        //HCF
        while (temp2!=0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        int hcf = temp1;

        int lcm = (num1*num2)/hcf;

        System.out.println("LCM: "+lcm);
        System.out.println("HCF: "+hcf);
    }
}
