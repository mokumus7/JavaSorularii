package ternary;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {

        /*
        Nested Ternary kullanarak Apex kodunu yazınız.
           Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
           Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
           Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Yil giriniz : ");
        int yil = input.nextInt();

     String leapMi =   yil%100==0 ?
             (yil %400==0 ? "Leap Year" : "Leap Yil Degildir"):
             (yil%4==0 ? "Leap Year": "Leap Yil Degildir.")   ;

        System.out.println("LeapMi = " + leapMi);



    }
}
