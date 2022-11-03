package arrays;

import java.util.Scanner;

public class Soru16_Pdf {

    public static void main(String[] args) {

        /*
        /*
 * Kullanicidan bir cumle ve bir harf alin,
 * Cumlede harfin kac kere
 * kullanildigini bulup, yazdirin

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cumle giriniz = ");
        String cumle = input.nextLine().toLowerCase();

        System.out.println("Bir harf giriniz = ");
        char harf = input.next().charAt(0);

        int counter = 0;

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == harf) {
                counter++;
            }




        }

        System.out.println("Girdiginiz cumlede "+harf+ " harfi "+counter+" tane vardir.");
    }
}