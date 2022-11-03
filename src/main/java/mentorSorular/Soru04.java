package mentorSorular;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {

        /*
          Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)
        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.
        Bu bir dik üçgendir
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz");
        int a = input.nextInt();
        System.out.println("Ikinci kenarı giriniz");
        int b = input.nextInt();
        System.out.println("Ucuncu kenarı giriniz");
        int c = input.nextInt();

        String sonuc = a*a+b*b == c*c ? "Bu bir dik üçgendir": "Bu bir dik üçgen değildir.";
        System.out.println(sonuc);



    }
}
