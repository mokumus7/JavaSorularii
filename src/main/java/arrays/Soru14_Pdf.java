package arrays;

public class Soru14_Pdf {
    public static void main(String[] args) {
/*
asagidaki multi dimensional ARRay'in tum elemanlarinin carpimini
ekrana yazdiran bir methot yaziniz.
{{1,2,3},{4,5,6}}
 */

        int sayi[][]= {{1,2,3},{4,5,6}};

        int carpım = 1 ;

        for(int [] w: sayi){

             for (int k :w){
                 carpım*=k;
             }
        }

        System.out.println(carpım);

    }
}
