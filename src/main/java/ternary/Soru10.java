package ternary;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {

        //10) Ternary kullanarak; konsolda sayı pozitif ise “Pozitif” , negatif ise “Pozitif Değil” yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi= input.nextInt();
        
       String sonuc = sayi>0 ? "Pozitif" : sayi==0 ? "Notr":"Nagatif";

        System.out.println("sonuc = " + sonuc);
    }
}
