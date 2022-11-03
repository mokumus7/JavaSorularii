package lists;

import java.util.ArrayList;
import java.util.List;

public class Soru13 {
    public static void main(String[] args) {
        /*
        Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
             olup olmadığını kontrol ediniz.
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);

        int counter =0;

        for(Integer w : myList){

            for(Integer k : myList){

                if(w==k){

                    counter++;
                }

            }
        }


        if(counter<= myList.size()){
            System.out.println("Tekrarsiz");
        }else {
            System.out.println("Tekrarli");
        }
    }
}
