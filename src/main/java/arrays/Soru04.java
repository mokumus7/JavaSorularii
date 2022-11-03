package arrays;

import java.util.Arrays;

public class Soru04 {
    public static void main(String[] args) {
        /*
        String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini  alınız.
            Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM
         */


        String names[] = {"Kemal","Jonathan","Mark","Jackson","Ali"};

        for(String w : names){


            if( w.endsWith("n") || w.endsWith("k")){
                System.out.print(w.charAt(0) + " ");
            }
//  2.yol
//  String str = w.substring(w.length()-1);

//     if(str.equals("n") || str.equals("k")){
//             System.out.println(w);
//            }


        }



    }
}
