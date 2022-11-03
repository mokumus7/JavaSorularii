package Inheritance.transfer2;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {

        /*
        Soru1:Asagıdaki multidimensional arraylerin ic arraylerindeki tum elemanların toplamını birer birer bulan
ve her bir sonucu yeni arrayin icine yazdıran ve elemanı yapan , yeni arrayi ekrana yazdıran kodu yazınız.
         */

        int arr[][]= {{1,2,3},{4,5},{11,6,12}};

        int arr1[]= new int[arr.length];

        int toplam=0;
        int index=0;

        for(int i =0; i< arr.length; i++){

           int arr2[]=arr[i];

          for(int w: arr2){
              toplam+=w;
          }

            arr1[index]=toplam;
            index++;
          toplam=0;

        }

        System.out.println(Arrays.toString(arr1));
    }
}
