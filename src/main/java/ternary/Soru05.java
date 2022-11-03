package ternary;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {
        /*
        Nested Ternary kullanarak;
                Şifreyi kontrol etmek için kodu yazınız.
                8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
                8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır. 
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Sifrenizi giriniz :");
        String password = input.next();



       String passSonuc= password.length() >7 ? password.startsWith("i") ?
                       "Gecerli şifre": "Gecersiz sifre":
                password.startsWith("K") ?
                        "Gecerli şifre": "Gecersiz sifre";

        System.out.println("passSonuc = " + passSonuc);
    }
}
