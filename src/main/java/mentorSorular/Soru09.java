package mentorSorular;

import java.util.Scanner;

public class Soru09 {
    public static void main(String[] args) {

        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri

        Scanner input = new Scanner(System.in);
        System.out.println("Bir karekter giriniz :");

        char ch = input.next().charAt(0);

        String sonuc =(ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ?
                      (ch>='a' && ch<='z' ? "Kucuk Harf" : "Buyuk Harf"): "Harf degil";

        System.out.println("Sonuc = " + sonuc);

    }
}
