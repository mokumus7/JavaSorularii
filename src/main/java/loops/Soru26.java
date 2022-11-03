package loops;

import java.util.Scanner;

public class Soru26 {
    public static void main(String[] args) {

        /*
        Kullanıcıya kaç tane fibonacci sayısı görmek istediğini sorunuz. Ardından bu fibonacci
sayılarını yazdıran kodu yazınız.
Örnek: kullanıcı 6 girerse çıktı 1 1 2 3 5 8 olacaktır.
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Kac tane fibonacci sayisi gormek istiyorsunuz");
        int adet = input.nextInt();
        int fb1=1;
        int fb2=1;
        int fbnc =0;
        System.out.print(fb1 + " ");
        System.out.print(fb2 + " ");

        for(int i =1; i<adet-1; i++){
                fbnc= fb1+fb2;
            System.out.print(fbnc+ " ");
            fb1=fb2;
            fb2=fbnc;
        }


    }
}
