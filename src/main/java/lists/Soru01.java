package lists;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru01 {
    public static void main(String[] args) {
        
    List<Integer> sayilar = new ArrayList<>();

    sayilar.add(12);
    sayilar.add(15);
    sayilar.add(40);
    sayilar.add(23);
    sayilar.add(35);
    sayilar.add(16);
        System.out.println(sayilar);
        Collections.sort(sayilar);

        int fark = Integer.MAX_VALUE;

      for(int i =1 ;i<sayilar.size(); i++){

          fark=Math.min(fark,sayilar.get(i)-sayilar.get(i-1));
      }

        System.out.println("fark = " + fark);


     for(int i =1 ; i<sayilar.size(); i++){

         int a = sayilar.get(i)-sayilar.get(i-1);
         if(a==fark){

             System.out.println(sayilar.get(i) + " and "+ sayilar.get(i-1));
         }
     }
    }
}
