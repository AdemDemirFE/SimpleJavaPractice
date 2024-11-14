package kullaniciGirisi;

import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = "enescelep", password = "tryinhard", usernameCheck, passwordCheck;

        System.out.println("-- LOGIN SCREEN --");
        System.out.print("Username: ");
        usernameCheck = scanner.next();

        if ((!username.equals(usernameCheck))) {
            System.out.print("Username is wrong, wanna change the password? (type 'yes' or 'no'): ");
            String choice = scanner.next();
            if(choice.equals("yes")) {
                System.out.print("New password: ");
                passwordCheck = scanner.next();
                if(password.equals(passwordCheck)) {
                    System.out.print("Couldn't generate the passwqord. Please try again");
                } else {
                    System.out.print("Password generated. Have a great day!");
                }
            }
        } else {
            System.out.print("Password: ");
            passwordCheck = scanner.next();
            if (password.equals(passwordCheck)) {
                System.out.println("Logged in successfully!");
            } else {
                System.out.println("Password is wrong. Please try again");
            }
        }
    }
}
