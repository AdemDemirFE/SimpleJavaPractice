package ArtikYilHesaplama;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter year: ");
        int year = scanner.nextInt();
        String result = "";
        if(year % 100 == 0) {
            if (year % 400 == 0) {
                result = year + " is leap year";
            } else {
                result = year + "is not leap year";
            }
        } else if (year % 4 == 0) {
            result = year + " is leap year";
        } else {
            result = year + "is not leap year";
        }
        System.out.println(result);
    }
}
