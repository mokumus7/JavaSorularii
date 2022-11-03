package mentorSorular;

import java.util.Scanner;

public class Soru08Ternary {
    public static void main(String[] args) {


        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        String sonuc = sayi>=0 ? (sayi<10 ? "Rakam" : "Pozitif Sayi"):"Negatif Sayi";
        System.out.println("Sonuc = " + sonuc);
    }
}
