package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Soru02 {

    public static void main(String[] args) {
        /*
        String’ lerden oluşan bir arrayde uzunluğu en küçük olan elemanları bulunuz.
               Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
         */


        String names[] = {"Jonathan","Kemal","Mark","Angie","Veli"};

    Arrays.sort(names, Comparator.comparingInt(String::length));

        System.out.println(names[names.length-1]);

        System.out.println(names[0]);




    }
}
