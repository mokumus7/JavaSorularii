package loops;

import java.util.Scanner;

public class Soru25 {
    public static void main(String[] args) {
        /*
        Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
yönlendiriniz
         */

//        Scanner input = new Scanner(System.in);
//        System.out.println("Bir sayi giriniz : ");
//        int sayi = input.nextInt();
//
//        if(sayi>0){
//
//                if(sayi==1){
//                    System.out.println("1 asal degildir.");
//                       }else {
//                    for (int i = 1; i <= sayi; i++) {
//                        if (i == 1 || i == sayi) {
//                            continue;
//                        } else {
//                            if (sayi % i != 0) {
//                                System.out.println(sayi + " asal sayidir.");
//                                break;
//                            } else System.out.println(sayi + " asal sayi degildir.");
//                            break;
//                        }
//                    }
//                }
//
//        }else System.out.println("Pozitif bir tam sayı giriniz");
//
//



        Scanner input = new Scanner(System.in);

        System.out.println("Sayi giriniz");

        int sayi = input.nextInt();

        int sayici = 0;

        if(sayi>0){
           if(sayi==1){
               System.out.println("1 asal degildir.");
              }else {
                  for (int i = 2; i < sayi; i++) {

                      if (sayi%i == 0) {
                       sayici++;
                   }
               }
                  if(sayici==0){
                      System.out.println(sayi + " asal sayidir.");
                      }else System.out.println(sayi + " asal sayi degildir");

           }
        }else System.out.println("Pozitif bir tam sayı giriniz");







    }
}
