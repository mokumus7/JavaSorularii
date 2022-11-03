package ternary;

import java.util.Scanner;

public class Soru08 {

    public static void main(String[] args) {

/*
Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde, 
kodunuz " Bu sayı 3 basamaklı değildir" olacaktır
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = input.nextInt();
        sayi=Math.abs(sayi);

       String sonuc = sayi>99 && sayi<1000 ? "Uc basamakli": "Uc basamakli değildir";
        System.out.println("sonuc = " + sonuc);
        
    }
}
