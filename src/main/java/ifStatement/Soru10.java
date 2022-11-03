package ifStatement;

public class Soru10 {

    public static void main(String[] args) {

        /*
        ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.
            a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz,
"Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
            b) Kısaltmada küçük harfler var ise kodunuz,
 "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
            c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz,
 "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır
         */

        String eyaletKisaltmasi = "CAn";
        boolean sart = eyaletKisaltmasi.replaceAll("[A-Za-z]", "").length() > 0;

        if (eyaletKisaltmasi.length() > 2) {
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");

        }else if (eyaletKisaltmasi.contains("[a-z]")) {
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");

        } else if (sart) {
            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");

        } else System.out.println("Kisaltmaniz gecerlidir.");

    }
}