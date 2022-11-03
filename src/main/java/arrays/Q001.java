package arrays;

import java.util.Scanner;

public class Q001 {

    public static void main(String[] args) {

        /*
        Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.

   {4,6,5,-10,8,5,20} ===> 10
   4 + 6 = 10
   5 + 5 = 10
  -10 + 20 = 10
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmak istiyorsunuz?");
        int elemanSayisi= input.nextInt();

        int sayilar[]= new int[elemanSayisi];

        System.out.println("Toplami kaca esit olsun ?");
        int toplam = input.nextInt();

       for(int i = 0; i<elemanSayisi;i++){
           System.out.println("Lütfen "+ (i+1) +". sayiyi giriniz = ");
           sayilar[i]= input.nextInt();
       }

       for(int i = 0; i<elemanSayisi; i++){

           for (int k =1; k<elemanSayisi; k++){

               if(sayilar[i]+sayilar[k]==toplam){
                   System.out.println(sayilar[i] + " and "+ sayilar[k]);
               }

           }

       }


    }
}
