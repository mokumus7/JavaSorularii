package ifStatement;

import java.util.Scanner;

public class Soru05 {

    public static void main(String[] args) {
        /*Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ay numarasi giriniz : ");

        int aynmb = input.nextByte();

        if (aynmb < 1 || aynmb > 12) {
            System.out.println("Gecerli bi ay numarasi giriniz!..");
        } else if (aynmb == 1) {
            System.out.println("Ocak");
        } else if (aynmb == 2) {
            System.out.println("Subat");
        } else if (aynmb == 3) {
            System.out.println("Mart");
        } else if (aynmb == 4) {
            System.out.println("Nisan");
        } else if (aynmb == 5) {
            System.out.println("Mayis");
        } else if (aynmb == 6) {
            System.out.println("Haziran");
        }else if (aynmb == 7) {
            System.out.println("Temmuz");
        }else if (aynmb == 8) {
            System.out.println("Agustos");
        }else if (aynmb == 9) {
            System.out.println("Eylul");
        }else if (aynmb == 10) {
            System.out.println("Ekim");
        }else if (aynmb == 11) {
            System.out.println("Kasim");
        }else if (aynmb == 12) {
            System.out.println("Aralik");
        }
    }
}
