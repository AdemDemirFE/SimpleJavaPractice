package MinMax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number do you want to enter?\n:");
        int n = scanner.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            System.out.print("(" + i + ")Please enter a number: ");
            int num = scanner.nextInt();
            numbers.add(num);
        }
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Minimum value you entered: " + min + "\nMax value you entered: " + max);
    }
}
