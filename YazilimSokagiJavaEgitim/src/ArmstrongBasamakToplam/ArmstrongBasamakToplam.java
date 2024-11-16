package ArmstrongBasamakToplam;

import java.util.Scanner;

public class ArmstrongBasamakToplam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();

        int i = 0,sum=0;

        while(number != 0)
        {
            sum=(number%10)+sum;
            number /= 10;
            ++i;
        }
        System.out.println(sum);
    }
}
