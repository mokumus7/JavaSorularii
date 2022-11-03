package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q06 {
    public static void main(String[] args) {

        //Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(7);
        list.add(36);
        list.add(5);
        list.add(26);

        System.out.println(list);
        Collections.sort(list);
        System.err.println(list);


        int min = list.get(list.size() - 1);

        for(int i =0; i<list.size()-1; i++){

            int fark= list.get(i+1)- list.get(i);

           min=   Math.min(min,fark);

        }

        System.out.println(min);


        for(int i =0; i<list.size()-1; i++){

            int fark= list.get(i+1)- list.get(i);

            if(fark==1){

                System.out.println(list.get(i+1)+" and " +list.get(i));

            }
        }
    }
}
