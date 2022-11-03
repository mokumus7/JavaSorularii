package ifStatement;

import java.util.Scanner;

public class Soru08 {
    public static void main(String[] args) {

         /*
         Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
            a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz
"16 km" yazmalıdır (sayı dinamik olacak)
           b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
           c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
          */


        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediginiz islemi giriniz : ");
        String deger =input.nextLine();


       double mil =10;
        double saniye = 7200;
        double fahrenheit =83;


        if (deger.equals("mil degerini km'ye")) {

            System.out.println(mil*1.6);

        } else if (deger.equalsIgnoreCase("saniye degerini saate")) {
            System.out.println(saniye/3600);

        } else if (deger.equalsIgnoreCase("fahrenheit degerini santigrata")) {
            System.out.println((fahrenheit*5/9)-32);

        }else System.out.println("Yanlis giris yaptiniz");

    }
}
