package ifStatement;

public class Soru02_8karektericerensifre {
    public static void main(String[] args) {

        //Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        // a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        // b)  Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        // c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        // Not: Çözümdeki koşulların sıralarına dikkat ediniz.




        String password = "Mhmmt.12?Kms";

        boolean a = password.replace(" ","").length()>7;
        boolean b = password.
                    replaceAll("[a-zA-Z0-9]","").
                    replaceAll("\\p{Punct}","").
                    length()>0;

        String bb= b ? "Şifrede boşluk karakteri kullanmayınız":"";
        System.out.println("bb = " + bb);
        
       String sonuc = a && !b ? "Gecerli Sifre": "Gecersiz sifre";

        System.out.println("sonuc = " + sonuc);







    }
}
