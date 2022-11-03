package stringManipulation;

public class Soru15split {

    public static void main(String[] args) {

        /*
      String gomlekFiyat = ‘$12.99’;
      String kitapFiyat = ‘$35.99’;
      Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
     
         */
        // int sonuc = Integer.parseInt(intDeger);
        String gomlekFiyat = "$12.99";
        String kitapFiyat =  "$35.99";
        String aa = gomlekFiyat.replace("$","");
       String bb = kitapFiyat.replace("$","");


      //  Double.parseDouble methodu (İnteger.parceInt...vs) String bir degeri numeric bir data type'ina cevirir.
      double gomlek = Double.parseDouble(aa);
      double kitap = Double.parseDouble(bb);
      
      double toplam = gomlek+kitap;

        System.out.println("toplam = " + toplam);
      
      
        

        

        
        
    }
}
