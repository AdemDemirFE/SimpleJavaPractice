package KdvTutariHesaplama;

import java.util.Scanner;

public class KdvTutariHesaplama {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ücret değerini giriniz: ");
        double ucret = s.nextInt();
        double kdv = ucret > 1000 ? 8 : 18;
        double vergiliUcret = ucret + (ucret*kdv / 100);
        System.out.print("Alacağınız ürünün KDV ile oluşan yeni fiyatı: " + vergiliUcret);
    }
}
