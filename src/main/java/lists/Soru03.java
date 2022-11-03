package lists;

import java.util.ArrayList;
import java.util.List;

public class Soru03 {
    public static void main(String[] args) {
        //Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.



        List<Integer> nums = new ArrayList<>();

        nums.add(12);
        nums.add(6);
        nums.add(5);
        nums.add(2);
        nums.add(38);


        int toplam =0;

        for(Integer w : nums){

            toplam+=w;

        }

        System.out.println("Toplam = " + toplam);


    }
}
