package lists;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Soru15_Set {

    public static void main(String[] args) {
        /*
        Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
                Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
         */


     List<Integer> numbers= new ArrayList<>();

     numbers.add(10);
     numbers.add(31);
     numbers.add(15);
     numbers.add(7);
     numbers.add(15);
     numbers.add(7);
     numbers.add(7);

     List<Integer> newNums = new ArrayList<>();
     int counter= 0;
     for(Integer w :numbers){

         if(newNums.contains(w)){
            continue;
         }
         newNums.add(w);
         counter++;
     }

        System.out.println(counter + " farki oge vardir.");








    }
}
