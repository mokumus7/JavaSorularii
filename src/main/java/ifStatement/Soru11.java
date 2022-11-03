package ifStatement;

import java.util.Scanner;

public class Soru11 {
    public static void main(String[] args) {

        /*
         Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
oluşturmak için kod yazınız.
                a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
                b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
                c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
                d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Iki Tane Sayi giriniz = ");

        double sayi1= input.nextDouble();
        double sayi2= input.nextDouble();

        System.out.println("Bir islem seciniz = ('+' , '-', '/', '*')");

        String islem =input.next();


       //1.Yol..if
        if(islem.equals("+")){
            System.out.println("Toplam = " + (sayi1+sayi2));
        } else if (islem.equals("-")){
            System.out.println("Cikartma = " + (sayi1-sayi2));

        }  else if (islem.equals("/")){
            System.out.println("Bolme = " + (sayi1/sayi2));

        } else if (islem.equals("*")){
            System.out.println("Carpma = " + (sayi1*sayi2));

        }else
            System.out.println("Gecerli islem giriniz!..");


  //2.yol..switch
        switch (islem){

            case "+":
                System.out.println("Toplam = " + (sayi1+sayi2));
                break;
            case "-":
                System.out.println("Cikartma = " + (sayi1-sayi2));
                break;
            case "/":
                System.out.println("Bolme = " + (sayi1/sayi2));
                break;
            case "*":
                System.out.println("Carpma = " + (sayi1*sayi2));
                break;
            default:
                System.out.println("Gecerli islem giriniz!..");
                break;
        }





    }
}
