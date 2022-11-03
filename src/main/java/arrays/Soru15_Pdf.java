package arrays;

public class Soru15_Pdf {
    public static void main(String[] args) {
        /*
        asagidaki multi dimensional ARRay'in ic array'lerdeki son elemanlarin
        carpımını ekrana yazdirin
        {{1,2,3},{4,5,},{6}
         */

        int arr[][]={{1,2,3},{4,5},{6}};

        int carpim = 1;

        for(int[] w:arr){

            carpim*=(w[w.length-1]);

        }
        System.out.println(carpim);
    }
}
