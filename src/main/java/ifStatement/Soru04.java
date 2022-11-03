package ifStatement;

public class Soru04 {

    public static void main(String[] args) {

        /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
           a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
           b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
           c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre
         */

        //s-->
        String sifre = "muh*";

        boolean sart1 =sifre.replace(" ","").length()>7;

        boolean sart2 = sifre.contains(" ");

        if (sart2) {
            System.out.println("Şifrede boşluk karakteri kullanmayınız");
         } else if (sart1) {
            System.out.println("Gecerli sifre");

        }else
            System.out.println("Gecersiz Sifre");

    }
}
