package arrays;

import java.util.Arrays;

public class Soru03 {

    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
          bulunuz.
           Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
         */

        int sayi[]={-12,18,-5,23,-2,-58};
        Arrays.sort(sayi);

        int enBuyukNagatif = sayi[0];
        int enKucukPozitif = sayi[sayi.length-1];

        for(int w : sayi){
            if(w<0) {
                enBuyukNagatif = Math.max(enBuyukNagatif, w);
            }
            if(w>0){
                enKucukPozitif = Math.max(enKucukPozitif, w);
            }
        }

        System.out.println(enBuyukNagatif);
        System.out.println(enKucukPozitif);

    }

}
