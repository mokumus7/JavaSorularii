package mentorSorular;

import java.util.Scanner;

public class Sorruuuu {

    public static void main(String[] args) {

        /*
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Bir karekter giriniz...");

        char ch =input.next().charAt(0);

       String sonuc = (ch>='a' && ch<='z') || (ch>='A' && ch<= 'Z') ?
                (ch>='a' && ch<='z' ? "Kucuk Harf" : "Buyuk Harf" ) :"Harf degildir..";

        System.out.println("Sonuc = " + sonuc);
    }

}
