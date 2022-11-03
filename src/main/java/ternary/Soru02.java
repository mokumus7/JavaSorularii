package ternary;

import java.util.Scanner;

public class Soru02 {

    public static void main(String[] args) {

        /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
           a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
           b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
           c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "
         */

                Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlarini giriniz  =  ");

        int a = input.nextInt(),b = input.nextInt(),c = input.nextInt();


            if (a<b+c && a>b-c && a>c-b) {
                String snc = a == b && a == c ? "Eşkenar Üçgen" :
                        (a == b || a == c || b == c ? "İkizkenar Üçgen" : "Çeşit Kenar Üçgen");

                System.out.println("Sonuc = " + snc);
            }else
                System.out.println("Girdiginiz kenar uzunluklari ile bir ucgen cizilemez!..");
    }
}
