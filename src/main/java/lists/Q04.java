package lists;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
    public static void main(String[] args) {

        //Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(7);
        list.add(15);
        list.add(5);
        list.add(26);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(34);
        list2.add(340);

        list.addAll(list2);

        System.out.println(list);

        for(int w: list){

           if(w==15){

               list.set(list.indexOf(w),51);

           }

        }
        System.out.println(list);


    }
}
