package SinifGecme;

import java.util.Scanner;
public class SinifGecme {

/*
Sınıfı Geçme Durumu
Java koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program yapımı.

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int maths, physics, turkish, chemistry, music;

            System.out.println("Please enter your | MATHS - PHYSICS - TURKISH - CHEMISTRY - MUSIC | scores in order:");
            maths = scanner.nextInt();
            physics = scanner.nextInt();
            turkish = scanner.nextInt();
            chemistry = scanner.nextInt();
            music = scanner.nextInt();

            int average = (maths + physics + turkish + chemistry + maths) / 5;

            if (average >= 55 && average <= 100) {
                System.out.println("Passed the grade. Congrulations!");
            }
            else if (average < 55 && average >= 00) {
                System.out.println("You failed the grade.");
            }
            else {
                System.out.println("Your average have to be between 0 and 100");
            }
        }

}
