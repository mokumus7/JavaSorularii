package ternary;

import java.util.Scanner;

public class Soru06 {
    public static void main(String[] args) {

        /*
         Bir sayının mutlak değerini hesaplamak için kodu yazınız.
             Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
             Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpını
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");

       int n = input.nextInt();

        //1.Yol
       int num = n>=0 ? n:n*-1;
        System.out.println("Sayi = " + num);


        //2.Yol
       n= Math.abs(n);

        System.out.println("n = " + n);


    }
}
