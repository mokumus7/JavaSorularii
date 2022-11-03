package arrays;

import java.util.Arrays;

public class Soru11 {
    public static void main(String[] args) {

//Tamsayılardan oluşan arrayde bulunan sıfırları, array sonuna yerleştiren kod yazınız

        int arrr[]= {5,0,3,0,2,0,-7};

        int brr[]= new int[arrr.length];

        int indx=0;
        for(int w:arrr){
            if(w!=0){
                brr[indx]=w;
                indx++;
            }

        }

        System.out.println(Arrays.toString(brr));
    }
}
