package stringManipulation;

public class Soru03 {
    public static void main(String[] args) {
        /*
        Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
         konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         */


        String deger = "Antalya 15624...";

        int a = deger.replaceAll("[^a-z^A-Z]","").length();//Antalya
        int b = deger.replaceAll("[^0-9]","").length();//15624

        System.out.println("Sayisal = " + b);
        System.out.println("Alfabe = " + a);
    }
}
