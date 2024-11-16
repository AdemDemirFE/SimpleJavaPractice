package MukemmelSayiBulma;

import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("Mükemmel Sayı Bulma");
        System.out.println("----------------------");
        System.out.print("Bir sayı giriniz: ");

        int sayi = input.nextInt();
        int toplam = 0;

        for (int i = 1; i < sayi; i++)
        {
            if (sayi % i == 0)
            {
                toplam += i;
            }
        }
        if (toplam == sayi)
        {
            System.out.println(sayi + " \nBir mükemmel sayıdır!");
        }
        else
        {
            System.out.println(sayi + " \nBir mükemmel sayı değildir!");
        }

    }
}
