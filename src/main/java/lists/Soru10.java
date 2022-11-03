package lists;


import java.util.ArrayList;
import java.util.List;

public class Soru10 {
    public static void main(String[] args) {

        // Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(6);
        sayilar.add(7);
        sayilar.add(15);
        sayilar.add(9);
        sayilar.add(10);

        System.out.println("sayilar = " + sayilar);

        for(Integer w : sayilar){

            if(w==7 || w==10){
                continue;
            }

            sayilar.set(sayilar.indexOf(w),w+2 );
        }

        System.out.println("sayilar = " + sayilar);

    }
}
