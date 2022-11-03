package lists;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {

        //Listede 15 veya 13 varsa, bu elemanları kaldırınız.

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(7);

        list.add(5);


        if(list.contains(15) || list.contains(13)){

            for(int i =0; i<list.size(); i++){

                int sayi =list.get(i);

                if(sayi==15){
                    list.remove(list.indexOf(sayi));
                }
                if(sayi==13){
                    list.remove(list.indexOf(sayi));
                }

            }

        }else
            System.out.println("Listte 15 veya 13 elemani yoktur.");

        System.out.println(list);


    }
}
