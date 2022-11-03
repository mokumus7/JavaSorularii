package lists;

import java.util.ArrayList;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {

        //Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(7);
        list.add(36);
        list.add(5);
        list.add(26);

        int toplam=0;

        for(int w: list) {
            toplam+=w;

        }

        System.out.println(list);
        System.out.println(toplam);

    }
}
