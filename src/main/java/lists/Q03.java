package lists;

import java.util.ArrayList;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {

        //Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(7);
        list.add(36);
        list.add(5);
        list.add(26);

        int carpim=1;

        for(int w : list){

            if(w % 2==0){
                carpim*=w;
            }

        }

        System.out.println(carpim);
    }
}
