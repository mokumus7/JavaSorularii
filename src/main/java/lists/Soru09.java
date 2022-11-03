package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru09 {
    public static void main(String[] args) {
        //Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(12);
        sayilar.add(15);
        sayilar.add(19);
        sayilar.add(83);
        sayilar.add(16);
        sayilar.add(55);

        Collections.sort(sayilar);

        int fark = Integer.MAX_VALUE;


        for(int i = 1 ; i<sayilar.size(); i++){

            int a =  sayilar.get(i)-sayilar.get(i-1);

            fark= Math.min(fark,a);
        }
        System.out.println("fark = " + fark);

        for(int i=1 ; i<sayilar.size(); i++){
         int a =  sayilar.get(i)-sayilar.get(i-1);

         if(a==fark){
             System.out.println(sayilar.get(i)+ " & " +sayilar.get(i-1));

         }

     }
    }
}
