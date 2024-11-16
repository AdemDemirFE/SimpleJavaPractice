package DortveBesinKuvvetleri;

import java.util.Scanner;
public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number, squareOf4 = 1, squareOf5 = 1, sonuc4=1, sonuc5= 1;
    System.out.print("Please enter a number: ");
    number = scanner.nextInt();

    for (int i = 1; i <= number; i++) {
        if (i % 4 == 0) {
            for (int j = 1; j<= squareOf4; j++) {
                j*=4;
                j=sonuc4;
            }
            System.out.println(sonuc4);
            squareOf4++;
        }
        if (i % 5 == 0) {
            for (int j = 1; j<= squareOf5; j++) {
                j*=5;
                j=sonuc5;
            }
            squareOf5++;
            System.out.println(sonuc5);
        }
    }
}

}
