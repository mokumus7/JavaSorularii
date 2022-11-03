package ifStatement;

import java.util.Scanner;

public class Soru07 {

    public static void main(String[] args) {

        /*
        ) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
                 a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
                 b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
                 c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz..");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && a == c) {
            System.out.println("Eşkenar Ucgen");

        } else if (a == b || a == c || b == c) {
            System.out.println("Ikizkenar Ucgen");

        }else System.out.println("Çeşit Kenar Üçgen");

    }
}