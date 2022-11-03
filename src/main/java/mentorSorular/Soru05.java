package mentorSorular;

import java.util.Scanner;

public class Soru05 {

    public static void main(String[] args) {

        /*
        -------Kullanici tarafindan girilen bir sayinin
         mutlak degerini yazdirmak icin bir program yazin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");

        double sayi = input.nextDouble();
        double eksi = sayi*-1;


        if (sayi>=0){
            System.out.println(sayi);
        } else if (sayi<=0) {
            System.out.println(eksi);
        }else System.out.println("Gecerli Sayi giriniz");


        //Mutlak...
       double mutlak =Math.abs(sayi);

        System.out.println("Mutlak = " + mutlak);

    }
}
