package Ucgen;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Üçgenin kenar uzunlukları
        int a,b,c;
        System.out.println("Üçgenin bütün kenarlarını sırasıyla giriniz:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        int u = (a + b + c) / 2;

        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
