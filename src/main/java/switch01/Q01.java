package switch01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
  /*
        Yazdırmak için switch ifadesini kullanınız.
              a) Aralık, Ocak, Şubat için "Kış"
              b) Mart, Nisan, Mayıs için "Bahar"
              c) Haziran, Temmuz, Ağustos için "Yaz"
              d) Eylül, Ekim, Kasım için "Güz"
              e) Diğerleri için "Geçersiz ay adı"
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Bir ay ismi giriniz");

        String ayIsmi = input.next().toLowerCase();


        switch (ayIsmi){
            case "aralık":
            case "ocak":
            case "subat":
                System.out.println("Kis");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Bahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Guz");
                break;
            default:
                System.out.println("Gecerli bir ay ismi giriniz");

        }

    }
}
