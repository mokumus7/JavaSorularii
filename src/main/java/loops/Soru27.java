package loops;

import java.util.Scanner;

public class Soru27 {
    public static void main(String[] args) {

        /*
        Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
için bir kod yazınız.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int sayi = input.nextInt();

        int toplam= 0;

        for(int i = sayi ;i>0; i=i/10){
            int b= i%10;
            toplam=toplam+b*b*b;
        }

               if(sayi==toplam){
                   System.out.println("Armstrong");

               }else System.out.println("Degil");

    }
}
