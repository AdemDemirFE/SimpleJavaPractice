package ChinaZodiyagi;

import java.util.Scanner;

public class ChinaZodiyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleae enter your birth year: ");
        int birthYear = scanner.nextInt();
        String result = "";
        if(birthYear % 12 == 0) {
            result = "Monkey";
        } else if (birthYear % 12 == 1) {
            result = "Turkey";
        } else if (birthYear % 12 == 2) {
            result = "Dog";
        } else if (birthYear % 12 == 3) {
            result = "Pig";
        } else if (birthYear % 12 == 4) {
            result = "Mouse";
        } else if (birthYear % 12 == 5) {
            result = "Ox";
        } else if (birthYear % 12 == 6) {
            result = "Tiger";
        } else if (birthYear % 12 == 7) {
            result = "Rabbit";
        } else if (birthYear % 12 == 8) {
            result = "Dragon";
        } else if (birthYear % 12 == 9) {
            result = "Snake";
        } else if (birthYear % 12 == 10) {
            result = "Horse";
        } else if (birthYear % 12 == 11) {
            result = "Sheep";
        }
        System.out.println(result);
    }
}
