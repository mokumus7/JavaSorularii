package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru13 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 String girmesini isteyiniz. Stringlerin karakterleri ve karakter sayıları aynıysa
            konsola "Anagramdır" yazdırın. Aksi takdirde, konsolda "Anagram Değil" yazdırınız.
           Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Iki kelime giriniz = ");



        String str  = input.next().toLowerCase();
        String str1 = input.next().toLowerCase();

              String arr[] = str.split("");
              Arrays.sort(arr);
              String brr[] = str1.split("");
             Arrays.sort(brr);

        if(str.length()==str1.length()){
                if(Arrays.equals(arr,brr)){
                    System.out.println("Anagram");
                }else System.out.println("Anagram Değil");


        }else System.out.println("Anagram Değil");

    }
}
