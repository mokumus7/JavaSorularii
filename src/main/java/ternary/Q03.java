package ternary;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //ARtik yil
        //1. 100 bolunuyorsa 400 e bolunmelidir.
        //2. 100 e bolunmuyorsa 4'e bolunmelidir.


        Scanner input = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz = ");

        int dogumYili= input.nextInt();

     String sonuc =   dogumYili % 100 == 0 ?   (dogumYili % 400 == 0   ? "Artik yil"  : "ARtik yil degildir" )
                                             : (dogumYili %  4  == 0   ?  "Artik yil" : "Artik yil degildir" ) ;

        System.out.println(sonuc);



       int sayi = 15;

     String snc=  sayi % 2 == 0  ? "Cift": "Tek";
        System.out.println(snc);

    }
}
