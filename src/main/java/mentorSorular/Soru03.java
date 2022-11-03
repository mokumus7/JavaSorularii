package mentorSorular;

import java.util.Scanner;

public class Soru03 {

    public static void main(String[] args) {
        /*
        1.Kullanıcıdan vize ve final notlarını alınız.
        2.Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        3.not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..."
        küçük ise"Malesef dersten kaldınız..." yazdırınız

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz : ");
        int vize = input.nextInt();

       String vizeDurum = vize>=0 && vize<=100 ? "":"Yanlis not girdiniz";
        System.out.println(vizeDurum);
        System.out.println("Final notunuzu giriniz : ");
        int finall = input.nextInt();
        String finalDurum = finall>=0 && finall<=100 ? "":"Yanlis not girdiniz";
        System.out.println(finalDurum);

        System.out.println("Vize notunun yuzdesini giriniz : ");
        double vizeYuzdesi = input.nextDouble();
       String yuzde = vizeYuzdesi>=0 && vizeYuzdesi<=1 ? "":"Yanlıs yuzde girdiniz..";

                  System.out.println(yuzde);

        double finalYuzdesi = 1-vizeYuzdesi;

        double ortalama = vize*vizeYuzdesi+finall*finalYuzdesi;

        System.out.println("Ortalamaniz = " + ortalama);
        if(ortalama>=50) {
            System.out.println("Tebrikler dersi başarı ile geçtiniz...");
        } else if (ortalama<=50) {
            System.out.println("Malesef dersi başarı ile geçtiniz...");

        }else System.out.println("Yanlıs sonuc girdiniz..");
    }
}
