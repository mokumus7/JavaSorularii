package arrays;

public class Soru08 {
    public static void main(String[] args) {

        /*
        İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
         */

        String arr[] = {"anna", "Ankara", "tom", "suzan","isli"};

        for(String w : arr){
            w=w.toLowerCase();
         if(w.charAt(0)==w.charAt(w.length()-1)){

             System.out.println(w);
         }


        }

    }
}
