package preclasssorulari;

import java.util.Scanner;

public class Soru003 {
    public static void main(String[] args) {

        /*
Kullanicidan bir String isteyin ve bu Stringin palindrom olup olmadigini kontrol eden program yaziniz?
 */

        Scanner input = new Scanner(System.in);

        System.out.println("isminizi giriniz = ");

        String isim=input.next().toLowerCase();

        String ters ="";

        for(int i = isim.length()-1; i>-1; i--){

            String str = isim.substring(i,i+1);
            ters += str;

        }
        if(isim.equals(ters)){
            System.out.println("Palindrom");
        }else System.out.println("Palindrom degildir.");






    }
}
