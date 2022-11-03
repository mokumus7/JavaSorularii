package arrays;

public class Soru09 {
    public static void main(String[] args) {

        //Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yazınız.


        String arr[]= {"Apex", "is", "an", "object", "oriented", "programming", "language"};


        String oge = "is";

        for(String w : arr){

            if(w.equalsIgnoreCase(oge)){
                System.out.println(oge + " ogesi vardir.");
            }

        }


    }
}
