package ternary;

import java.util.Scanner;

public class Soru09 {
    public static void main(String[] args) {

        // Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız.


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");

        int sayi = input.nextInt();

       String sonuc = sayi % 2==0 ? "Cift ":"Tek";

        System.out.println("sonuc = " + sonuc);
    }
}
