package arrays;

public class Soru06 {
    public static void main(String[] args) {

        //Verilen bir String'de 'a' veya 'A' ile başlayan kelimeyi sayısını bulunuz.


        String str ="Turgay, biraz acele et! Aklini kullan. anladin mi? ";

        String arr[]=str.replaceAll("[\\p{Punct}]","").split(" ");

        int counter=0;

        for(String w : arr){
            if(w.startsWith("a") || w.startsWith("A")){
                counter++;
            }
        }

        System.out.println(counter);

    }
}
