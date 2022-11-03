package lists;

import java.util.ArrayList;
import java.util.List;

public class Q08 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("$12.99");
        list.add("$23.60");
        list.add("$54.45");


        //String bir listede verilen tüm fiyatların toplamını bulunuz.

        double toplam=0;


        for(String w : list){

       w=w.replace("$","");//12.99



       double sayi= Double.valueOf(w);

       toplam+=sayi;

        }

        System.out.println(toplam);


    }
}
