package Atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            int price = 0;
            switch (userName){
                case "patika":
                    switch (password) {
                        case "dev123":
                            do {
                                System.out.println("1-Para yatırma\n" +
                                        "2-Para Çekme\n" +
                                        "3-Bakiye Sorgula\n" +
                                        "4-Çıkış Yap");
                                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                                select = input.nextInt();
                                switch (select){
                                    case 1:
                                        System.out.print("Para miktarı : ");
                                        price = input.nextInt();
                                        balance += price;
                                        break;
                                    case 2:
                                        System.out.print("Para miktarı : ");
                                        price = input.nextInt();
                                        if (price > balance) {
                                            System.out.println("Bakiye yetersiz.");
                                        } else {
                                            balance -= price;
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Bakiyeniz: " + balance);
                                        break;
                                    default:
                                        System.out.println("Hata");
                                        break;
                                }
                            }while (select != 4);

                    }
                default:
                    right--;
                    System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                    switch (right){
                        case 0:
                            System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
                            break;
                        default:
                            break;

                    }
                    break;
            }
        }
    }
}
