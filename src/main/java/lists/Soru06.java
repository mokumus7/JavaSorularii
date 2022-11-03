package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru06 {
    public static void main(String[] args) {

        /*
        Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
              Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
                     (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
         */


        List<String> renkler = new ArrayList<>();

        renkler.add("Sari");
        renkler.add("Mavi");
        renkler.add("Kirmizi");
        renkler.add("Yesil");

        List<String> colors= new ArrayList<>();
        colors.addAll(renkler);
        Collections.sort(colors);

        System.out.println("renkler = " + renkler);
        System.out.println("colors = " + colors);


        int size = renkler.size();
        int flag = 0;
        for(int i=0; i<size; i++){
            if(colors.get(i).equals(renkler.get(size-1-i))){
                flag++;
            }
        }
        if(flag == size){
            System.out.println("Azalan siradadir");
        }else{
            System.out.println("Azalan sirada degil");
        }

    }
}
