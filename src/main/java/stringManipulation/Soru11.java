package stringManipulation;

public class Soru11 {

    public static void main(String[] args) {

        /*
        Bir String’ in başında ve sonunda boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.
         */

        String isim = "Muhammet okumus ";

       boolean ilkKarekter = isim.charAt(0)==' ';
       boolean sonKarekter = isim.charAt(isim.length()-1)==' ';

        String ilk = ilkKarekter ? "Ilk karekter bosluk":"Ilk karekter bosluk degil";
        String son = sonKarekter ? "Son karekter bosluk": "Son karekter bosluk degil";

        System.out.println("ilk= " + ilk);
        System.out.println("son = " + son);


    }
}
