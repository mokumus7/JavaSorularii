package stringManipulation;

public class Soru06 {

    public static void main(String[] args) {

        /*
        Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin
        toplamını bulunuz.
         */
        
        String deger = "Galatasaray";
        
        char ilkKarekter = deger.charAt(0);
        
        char sonKarekter = deger.charAt(deger.length()-1);
        
        int toplam = ilkKarekter+sonKarekter;

        System.out.println("toplam = " + toplam);
        
        
    }
}
