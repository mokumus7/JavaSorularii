package lists;

import java.util.ArrayList;
import java.util.List;

public class Q09 {
    public static void main(String[] args) {

        //Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
        //olup olmadığını kontrol ediniz.


        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(8);
        list.add(7);
        list.add(12);
        list.add(5);
        list.add(26);


        list.isEmpty();//FAlse



        for(int i= 0; i<list.size(); i++) {

         if(list.indexOf(list.get(i))==list.lastIndexOf(list.get(i))){

             System.out.print(list.get(i)+ " ");

         }

        }


        int counter=0;

        for(int w: list){

            for(int e: list){

                if(w==e){
                    counter++;

                }

            }
        }

        System.out.println(counter);

        if(counter==list.size()){
            System.out.println("Listte Tekrarli eleman yoktur.");
        }else
            System.out.println("Listte tekrarli eleman vardir");

    }
}
