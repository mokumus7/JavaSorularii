package mentorSorular;

import java.util.Scanner;

public class SoruMentorDeCoz {
    public static void main(String[] args) {
/*
TASK :
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
                System.out.println("Vize sınav sonucunuzu giriniz : ");
                double vize = input.nextDouble();
                double vizeSinavYuzdesi = 0.40;
                 String vizeDurum = vize>=0 && vize<=100 ? "Vize Sinavinin Yuzdesi  = 0.40" : "Gecerli not giriniz";
                      System.out.println(vizeDurum);



               System.out.println("Final sınav sonucunuzu girin");
               double finall= input.nextDouble();
                 double finalSinavYuzdesi = 0.60;
            String finalDurum =finall>00 && vize<=100 ? "Final Sinavinin Yuzdesi  = 0.60" : "Gecerli not giriniz";
           System.out.println(finalDurum);


                double a= vize*vizeSinavYuzdesi+finall*finalSinavYuzdesi;

               String adurum= a>=0 && a<=100 ? ("Ortalamaniz = "+ a):"Gecersiz Ortalama";
                 System.out.println(adurum);

                if(a>=0 && a<30){
                    System.out.println("Harf Notunuz = FF");

                } else if (30<=a && a<40) {
                    System.out.println("Harf Notunuz = DD");

                } else if (40<=a && a<50) {
                    System.out.println("Harf Notunuz = DC");

                } else if (50<=a && a<60) {
                    System.out.println("Harf Notunuz = CC");

                } else if (60<=a && a<70) {
                    System.out.println("Harf Notunuz = CB");

                } else if (70<=a && a<80) {
                    System.out.println("Harf Notunuz = BB");

                } else if (80<=a && a<90) {
                    System.out.println("Harf Notunuz = BA");
                } else if (90<=a && a<=100) {
                    System.out.println("Harf Notunuz = AA");

                }
    }
}
