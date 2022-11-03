package stringManipulation;

public class Soru01 {

    public static void main(String[] args) {

        /*
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun.
        Şehir ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde
        konsolda yazdırınız.
         */

        String sehir="ANTALYA";

        String a=sehir.substring(0,1).toUpperCase();
        String b=sehir.substring(1,7).toLowerCase();
        System.out.print(a+b);

    }
}
