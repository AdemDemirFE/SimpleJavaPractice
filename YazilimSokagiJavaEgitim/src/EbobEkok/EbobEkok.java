package EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int n2 = scanner.nextInt();

        int ebob = 1, i = 1;
        while(i <= n1) {
            if(n1 % i == 0 && n2 % i == 0) ebob = i;
            i++;
        }
        int ekok = (n1 * n2) / ebob;
        System.out.println("EBOB: " + ebob );
        System.out.println("EKOK: " + ekok );
    }
}
