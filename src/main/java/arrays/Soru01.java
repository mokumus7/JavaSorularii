package arrays;

import java.util.Arrays;

public class Soru01 {

    public static void main(String[] args) {
        /*
        Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
                    Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
                   (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 1
         */

        int numbers[]={5,10,15,20,25};

        Arrays.sort(numbers);
        int a = numbers.length;//4

        if(a%2!=0){
            System.out.println(numbers[a/2]);

        }else System.out.println((numbers[a/2]+numbers[a/2-1])/2);
    }
}
