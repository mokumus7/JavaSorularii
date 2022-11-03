package loops;

import java.util.Scanner;

public class DakikaSorusu {
    public static void main(String[] args) {
/*
Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
INPUT:
Dakika sayısı: 3456789
OUTPUT :
3456789 dakika yaklaşık 6 yıl 210 gündür

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Dakika Girin = ");
        int dakika = input.nextInt();
        int yil =60*24*365;
        int kacYil=0;

        for(int i =dakika;i>yil;i=i-yil ){

            kacYil++;
        }




        int kalan= dakika-(yil*kacYil);

        int gun =60*24;
        int kacGun=0;
        for(int i = kalan ;i>gun;i=i-gun){
            kacGun++;
        }




        System.out.println(dakika+" dakika "+ " yaklasik olarak " + kacYil +" yil "+ kacGun +" gundur.");
    }
}
