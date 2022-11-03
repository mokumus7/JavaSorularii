package ifStatement;

public class Soru09 {

    public static void main(String[] args) {

        // sonra coz.
        /*
        Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır. 
b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi" 
yazmalıdır. 
e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad" 
yazmalıdır
         */
        
        String tamisim="Ali Can";
        boolean e =tamisim.replaceAll("[a-zA-Z]","").replace(" ","").length()>0;
        
        if (tamisim.isBlank()) {
            System.out.println("Isim Girilmedi");
        } else if (e) {
            System.out.println("Gecersiz ad..");
        }
            
        }

    }


