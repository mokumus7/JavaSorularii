package lists;

import java.util.ArrayList;
import java.util.List;

public class Soru11 {
    public static void main(String[] args) {
        //String bir listede verilen tüm fiyatların toplamını bulunuz.
        //Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04


        List<String> fiyatlar = new ArrayList<>();
        fiyatlar.add("$54.45");
        fiyatlar.add("$12.99");
        fiyatlar.add("$23.60");


        double toplam =0;

        for(String w : fiyatlar){

         String b =   w.replace("$","");
          Double a = Double.valueOf(b);

          toplam+=a;

        }

        System.out.println("toplam = " + toplam);
    }
}
