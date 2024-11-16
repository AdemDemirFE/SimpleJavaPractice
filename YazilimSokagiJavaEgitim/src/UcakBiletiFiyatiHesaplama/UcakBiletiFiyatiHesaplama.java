package UcakBiletiFiyatiHesaplama;

import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double range, price;
        int age, tripType;
        System.out.print("Please enter range: ");
        range = scanner.nextDouble();
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.println("Please enter trip type (1 or 2)");
        tripType = scanner.nextInt();

        if((age > 0 && range > 0) && (tripType == 1 || tripType == 2)) {
            price = range * 0.1;
            double ageDiscount;
            if (age < 12 && tripType == 2)  {
                ageDiscount = age * 0.5;
                price = (price - ageDiscount) * 0.2;
                System.out.println("price = " + price);
            } else if (age < 12) {
                ageDiscount = age * 0.5;
                price = (price - ageDiscount);
                System.out.println("price = " + price);
            } else if (age <= 24 && tripType == 2) {
                ageDiscount = age * 0.1;
                price = ((price - ageDiscount) * 0.2);
                System.out.println("price = " + price);
            } else if (age <= 24) {
                ageDiscount = age * 0.1;
                price = (price - ageDiscount) ;
                System.out.println("price = " + price);
            } else if (age > 65 && tripType == 2) {
                ageDiscount = age * 0.3;
                price = (price - ageDiscount) * 0.2;
                System.out.println("price = " + price);
            } else if (age > 65) {
                ageDiscount = age * 0.3;
                price = (price - ageDiscount);
                System.out.println("price = " + price);
            }
        } else {
            System.out.println("You entered wrong info.");
        }

    }
}
