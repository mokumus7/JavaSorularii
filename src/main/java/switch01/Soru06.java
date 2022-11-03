package switch01;

import java.util.Scanner;

public class Soru06 {
    public static void main(String[] args) {

        /*
        Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
yapan basit bir hesap makinesi oluşturmak için kod yazınız.
          a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
          b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
          c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
          d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
          e) Kullanıcı 10 ve -5 girdiğinde +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi Giriniz = ");

        double a = input.nextDouble(), b = input.nextDouble();

        System.out.println("Bir islem seciniz = (+,-,*,/)");
        char islem = input.next().charAt(0);

        switch (islem){

            case '+':
                System.out.println("Toplama = " + (a+b));
                break;
            case '-':
                System.out.println("Cikartma = " + (a-b));
                break;
            case '*':
                System.out.println("Carpma = "+ (a*b));
                break;
            case '/':
                System.out.println("Bolme = "+ (a/b));
                break;
            default:
                System.out.println("Gecerli islem giriniz!..");

        }

    }
}
