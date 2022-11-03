package day01_variables;

public class Soru06 {
    public static void main(String[] args) {
        /*3 öğe (kitap, defter ve laptop) fiyatı için long data
         tipinde değişkenler oluşturunuz.

                Konsolda 2 kitap, 4 defter ve 3 laptop
        için toplam fiyatını yazdırınız.*/

        long kitapFiyati= 23L;
        long defterFiyati= 18L;
        long laptopFiyati=8399L;

        long toplamFiyat=(defterFiyati*4)+(kitapFiyati*2)+(laptopFiyati*3);

        System.out.println("Toplam Fiyat = " + toplamFiyat);
    }
}
