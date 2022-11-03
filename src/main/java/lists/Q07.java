package lists;

import java.util.ArrayList;
import java.util.List;

public class Q07 {
    public static void main(String[] args) {

    //Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(7);
        list.add(16);
        list.add(5);
        list.add(10);

        System.out.println(list);
        for(int w : list){

            if(w==7 || w == 10){

                continue;
            }
            list.set(  list.indexOf(w),  w+2);
        }
        System.err.println(list);

    }
}
