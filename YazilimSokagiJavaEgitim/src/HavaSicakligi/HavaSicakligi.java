package HavaSicakligi;
import java.util.Scanner;

public class HavaSicakligi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type the temprature: ");
        int temprature = scanner.nextInt();

        String result = temprature<5 ? "Ski" :
                ((temprature>= 5 && temprature<= 15) ? "Cinema" :
                        ((temprature >= 10 && temprature <= 25) ? "Picnic" :
                                ((temprature > 25) ? "Swimming" : "Be safe")));
        System.out.println(result);
    }
}