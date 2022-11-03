package switch01;

import java.util.Scanner;

public class Soru07 {

    public static void main(String[] args) {
        /*

         Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
         a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde,
 konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
         b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
         c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
         d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata ‘dan farklı bir işlem girdiğinde,
 kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediginiz islemi giriniz : ");
        String islem = input.nextLine().toLowerCase();


        switch (islem){

            case "mili km'ye":
                System.out.println("Mil Giriniz : ");
                int mil = input.nextInt();

                System.out.println("Km = "+ (mil*1.6));
                    break;
            case "fahrenhaytı santigrata":
                System.out.println("Fahren Giriniz : ");
                int fahren = input.nextInt();

                System.out.println("Santigrat = "+ ((fahren-32)*5/9));
                   break;
            case "saniyeyi saate" :
                System.out.println("Saniyı Giriniz : ");
                int saniye = input.nextInt();
                System.out.println("Saat = "+ (saniye/3600) );
                    break;
            default:
                System.out.println("Gecerli bir islem giriniz");

        }






















    }
}
