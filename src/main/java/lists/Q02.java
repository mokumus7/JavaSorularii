package lists;

import java.util.ArrayList;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {

        //Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.

        List<Integer> list = new ArrayList<>();

        list.add(12);//0
        list.add(8);//1
        list.add(7);//2
        list.add(36);//3
        list.add(13);//4
        list.add(26);//5

        int toplam =0;

        for(int i = 0; i<list.size();i++){

          int sayi=  list.get(i);

          if(sayi==13){
              break;
          }

          toplam+=sayi;

        }

        System.out.println(list);
        System.out.println(toplam);


        }


    }


