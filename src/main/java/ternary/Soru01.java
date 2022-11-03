package ternary;

public class Soru01 {
    public static void main(String[] args) {

      /*
       Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
         Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
         Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
       */

    String parola =".?pass";

   boolean pass = parola.replace("","").length()>7;

    String sonuc =  pass ? "Geçerli Parola" : "Geçersiz Parola";

        System.out.println("Sonuc = " + sonuc);

    }
}
