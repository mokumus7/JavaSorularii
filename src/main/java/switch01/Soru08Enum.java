package switch01;

public class Soru08Enum {

    public static void main(String[] args) {

        /*

      *  Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını
koyunuz.
      * Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX,
      * YANDEX'ten farklı tarayıcılar için 'Geçersiz tarayıcı' yazınız.

Not: Geliştirici konsolunda enum oluşturmalısınız
         */

        /*
        Strin şeklinde verilen aşağıdaki fiyatların toplamını bulunuz
                String str1="$13.99";
                String str2="$10.55";
                İpucu olarak Double.parseDouble
         */
        String str1="$13.99";
        String str2="$10.55";

       str1= str1.substring(1,6);
       str2= str2.substring(1,6);

       double sayi1 =Double.valueOf(str1);
       double sayi2 =Double.valueOf(str2);

        System.out.println("Toplam = " + (sayi1+sayi2));
    }
}
