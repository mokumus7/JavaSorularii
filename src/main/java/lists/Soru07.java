package lists;

import java.util.ArrayList;
import java.util.List;

public class Soru07 {
    public static void main(String[] args) {

        /*
        Listede eleman olarak 15 varsa, tüm 15'leri 51 olarak değiştiriniz.
              Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43
         */


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(11);
        nums.add(15);
        nums.add(34);
        nums.add(43);
        nums.add(15);

if(nums.contains(15)) {
    for (Integer w : nums) {

        if (w == 15) {
            nums.set(nums.indexOf(w), 51);
        }
    }
}else {
    System.out.println("15 icermiyor");
}
        System.out.println("Nums = " + nums);
    }
}
