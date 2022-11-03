package day01_variables;

public class Soru04 {
    public static void main(String[] args) {
        /*
        Bir String ve iki long data tipinde değişken oluşturunuz.
        Konsolda bu long değişkenlerin toplamını ve çarpımını String ile yazdırınız.

         */

        long x =17;
        long y= 23;
        String isim= "Kamil";

        String toplam = ((x+y)+ isim);

        String carpma = (x*y)+isim;

        System.out.println("Carpma = " + carpma);
        System.out.println(" Taoplam = "+ toplam );


    }
}
