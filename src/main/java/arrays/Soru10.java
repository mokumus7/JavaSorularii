package arrays;

public class Soru10 {
    public static void main(String[] args) {
        //Verilen bir String arraydeki öğelerin karakterlerinin toplamını bulmak için kod yazınız.

        String arry[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int sum =0;
        for(String w : arry){
            sum+=w.length();


        }

        System.out.println(sum);
    }
}
