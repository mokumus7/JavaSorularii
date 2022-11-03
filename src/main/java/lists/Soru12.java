package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru12 {
    public static void main(String[] args) {
        /*
         Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
         */

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$8.25");
        myList.add("$54.45");

        List<Double> yeniList = new ArrayList<>();

        for(String w : myList){

          Double fiyat= Double.valueOf( w.replace("$", ""));
          yeniList.add(fiyat);

        }

        Collections.sort(yeniList);

        double a=  yeniList.get(0);
        double b=  yeniList.get(yeniList.size()-1);

        System.out.println(a +" ve "+ b);
    }
}
