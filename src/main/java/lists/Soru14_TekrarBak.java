package lists;

import java.util.ArrayList;
import java.util.List;

public class Soru14_TekrarBak {
    public static void main(String[] args) {
        /*
        Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
yazınız.

Not:
Mountain Array ==> [0, 2, 5, 3, 1]
Bir array elemanları en büyük değerine kadar sürekli artan,
en büyük değerinden sonra sürekli azalan değer alıyorsa Mauntain Array' dir.
Mountain Array Değil ==> [5, 2, 7, 1, 4]
Bir array elemanları en büyük değerine kadar sürekli azalan,
en büyük değerinden sonra sürekli artan değer alıyorsa Mauntain Array değildir.
         */


        int arr[]= {0,   2,    5,   3,    1};

        List<Integer> sayilar = new ArrayList<>();

       for(int i =0; i<5; i++){
           sayilar.add(arr[i]);
       }
        System.out.println(sayilar);

          int max = Integer.MIN_VALUE;

       for(Integer w : sayilar){
         max=  Math.max(w,max);
       }
        System.out.println(max);


       int counter =0;

        for(int i =1 ;i<3; i++) {

            if (sayilar.get(sayilar.indexOf(i)) < sayilar.get(sayilar.indexOf(i-1))) {
                counter++;
            }

        }
        for(int i=2; i< 4;i++){

            if(sayilar.get(sayilar.indexOf(i)) < sayilar.get(sayilar.indexOf(i+1))) {
                counter++;

            }
        }

    if(counter==0){
        System.out.println("Mountain Array");
    }else
        System.out.println(" Mountain Array  deildir.");


    }
}
