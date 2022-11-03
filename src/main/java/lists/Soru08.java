package lists;

import java.util.ArrayList;
import java.util.List;

public class Soru08 {
    public static void main(String[] args) {
/*
 Listede 15 veya 13 varsa, bu elemanları kaldırınız.
     Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
 */

        List<Integer> myList = new ArrayList<>();

        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(54);
        myList.add(13);

        for(Integer w : myList){

            if(w==13 || w==15){

                myList.remove(myList.indexOf(13));
                myList.remove(myList.indexOf(15));

            }
        }

        System.out.println("myList = " + myList);


    }
}
