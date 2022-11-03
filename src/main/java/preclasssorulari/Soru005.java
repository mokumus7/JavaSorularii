package preclasssorulari;

import java.util.Scanner;

public class Soru005 {
    public static void main(String[] args) {

//kullanicidan 10 dan kucuk bir tam sayi isteyin ve girilen sayinin faktoriyelini bulun?



        Scanner input = new Scanner(System.in);
        System.out.println("10 dan kuuck bir sayi giriniz");
        int sayi = input.nextInt();

        if (sayi<10 && sayi>0){
            int carpim=1;

            for(int i =sayi ; i>0; i--){
                carpim*=i;
            }
            System.out.println(carpim);

        }else System.out.println("Yanlis sayi girdiniz.");
    }
}
