package Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, r;
        System.out.print("Please enter number N: ");
        n = scanner.nextInt();
        System.out.println("Please enter number r");
        r = scanner.nextInt();
        int nFactorial = factorial(n), rFactorial = factorial(r), c = nFactorial / (rFactorial * factorial(n-r));
        System.out.println("C(n,r) = " + c);

    }
    public static int factorial (int n) {
        int factorial = 1;
        for (int i = 1; i<=n; i++) {
            i *= factorial;
        }
        return factorial;
    }
}
