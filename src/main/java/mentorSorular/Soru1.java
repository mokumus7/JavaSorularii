package mentorSorular;

import java.util.Scanner;

import java.util.Scanner;

public class Soru1 {

    public static void main(String[] args) {

        /*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.

                                  eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                  80(80dahil)   ile 90 arasında ise  BA,
                                  70(70 dahil)   ile 80 arasında ise BB,
                                  60(60dahil) ile 70 arasında ise CB,
                                  50(50 dahil) ile 60 arasında ise CC,
                                  40(40 dahil) ile 50 arasında ise DC,
                                  30(30 dahil) ile 40 arasında ise DD,
                                  30 'dan düşük ise FF            gelmeli.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz:");

        double vize = input.nextDouble();
        double vizeOran =0.30;

        String vizesonuc =( vize>=0 && vize <=100) ? "Vize'nin orani = 0.30":"Kullanici yanlıs not girdin!!";

        System.out.println("vizesonuc = " + vizesonuc);

        System.out.println("Final notunuzu giriniz :");

        double finall = input.nextDouble();
        double finalOran =0.70;

        String finalDurum = (finall>=0 && finall <=100) ? "Final'in oranı 0.70": "Kullanici yanlıs not girdin!!";
        System.out.println("finalDurum = " + finalDurum);

      double  ortalama = vize*vizeOran+finall*finalOran;

      if(ortalama<30){
          System.out.println("Notunuz = FF");

      } else if (ortalama>=30 && ortalama<40) {
          System.out.println("Notunuz = DD");

      } else if (ortalama>=40 && ortalama<50) {
          System.out.println("Notunuz = DC");

      }else if (ortalama>=50 && ortalama<60) {
          System.out.println("Notunuz = CC");

      }else if (ortalama>=60 && ortalama<70) {
          System.out.println("Notunuz = CB");

      }else if (ortalama>=70 && ortalama<80) {
          System.out.println("Notunuz = BB");

      }else if (ortalama>=80 && ortalama<90) {
          System.out.println("Notunuz = BA");

      }else if (ortalama>=90 && ortalama<=100) {
          System.out.println("Notunuz = AA");

      }else System.out.println("Yanlis not girdiniz");

        System.out.println("ortalama = " + ortalama);

    }
}
