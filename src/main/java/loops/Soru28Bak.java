package loops;

import java.util.Scanner;

public class Soru28Bak {
    public static void main(String[] args) {
        /*
        Belirli bir sayıdan küçük tüm asal sayıları yazdıran bir kod yazınız.
              Örnek: kullanıcı 20 girerse çıktı 2, 3, 5, 7, 11, 13, 17, 19 olacaktır.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int sayi = input.nextInt();

        int sayici=0;
        if(sayi>1){

            for(int i =2; i< sayi; i++){

                if(sayi%i==0){


                }



            }






        } else if (sayi==1) {
            System.out.println("En kucuk asal sayi 2'dir.");

        }else
            System.out.println("Pozitif bir tam sayı giriniz");

    }
}
