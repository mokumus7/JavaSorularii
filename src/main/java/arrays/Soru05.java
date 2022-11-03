package arrays;

public class Soru05 {
    public static void main(String[] args) {
        /*
        String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
                Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
         */


        String arr[] = { "Kemal", "Jonathan", "Mark", "Angie", "Veli" };

        int toplamKarekter= 0;

        
        for(String w : arr){
            
        toplamKarekter+= w.length();
            
        }

        System.out.println("toplamKarekter = " + toplamKarekter);
    }
}
