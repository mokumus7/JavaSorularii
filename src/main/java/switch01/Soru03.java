package switch01;

import java.util.Scanner;

public class Soru03 {

    public static void main(String[] args) {

        /*
        Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
             Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ay numarasi giriniz : ");

        int ayNo = input.nextInt();

        switch(ayNo) {
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Subak");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayis");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Agustos");
            case 9:
                System.out.println("Eylül");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasim");
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Geçersiz numara");

        }
    }
}
