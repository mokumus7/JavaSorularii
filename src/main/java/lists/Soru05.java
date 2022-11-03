package lists;

import java.util.ArrayList;
import java.util.List;

public class Soru05 {
    public static void main(String[] args) {
//Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.


        List<Integer> nums = new ArrayList<>();

        nums.add(7);
        nums.add(6);
        nums.add(5);
        nums.add(13);
        nums.add(2);
        nums.add(4);


        int carpim=1;

        for(Integer w : nums){

            if(w%2==0){
                carpim*=w;
            }

        }

        System.out.println("Carpim = " + carpim);
    }
}
