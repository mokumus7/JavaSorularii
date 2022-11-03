package preclasssorulari;

import java.util.Scanner;

public class Soru004 {

    public static void main(String[] args) {
        //kullanicidan 2 sayi isteyin ve girilen sayilari ve aralarindaki butun sayilari toplayan code yazin.


        Scanner input = new Scanner(System.in);
        System.out.println("iki tane sayi giriniz");
        int a = input.nextInt(), b = input.nextInt();

        int toplam = 0;
        if(a<b){

            for(int i = a; i<b+1; i++){
                toplam+=i;
            }
            System.out.println(toplam);
        } else if (b<a) {
            for(int i =b; i<a+1;i++) {
                toplam += i;
            } System.out.println(toplam);
        }
             else if (a==b) {
            System.out.println(a+b);
        }

    }
}
