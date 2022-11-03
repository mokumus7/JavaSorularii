package preclasssorulari;

import java.util.Scanner;

public class Soru001 {
    public static void main(String[] args) {

        /*
        kullanicidan bir STring isteyin ve Stringi tersten yazdirin
         */


        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz : ");
        String isim =input.next();

        String bos = "";

        for(int i =isim.length()-1; i>-1; i--){

            String str = isim.substring(i,i+1);

            bos+=str;
        }
        System.out.println(bos);





    }
}
