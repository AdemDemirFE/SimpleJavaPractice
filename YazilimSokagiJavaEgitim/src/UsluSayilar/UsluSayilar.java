package UsluSayilar;

import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, power, number;
        System.out.print("Please enter base: ");
        base = scanner.nextInt();
        number = base;
        System.out.print("Please enter power: ");
        power = scanner.nextInt();
        if (power == 0) {
            System.out.println(1);
        } else if (power == 1) {
            System.out.println(number);
        } else {
            for (int i = 1; i < power; i++) {
                number = number * number;
            }
            System.out.println(number);
        }
    }
}
