package switch01;

import java.util.Scanner;

public class Soru04 {
    public static void main(String[] args) {
        /*
        Cinsiyet "Erkek" ise "Erkek" yazdırınız.
            Cinsiyet "Kadın" ise "Kız" yazdırınız.
            Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
            Not : Bu seçenekler dışındakilerini yoksayınız
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz : ");

        String cinsiyet =input.next().toLowerCase();

        switch (cinsiyet){
            case "erkek":
                System.out.println("Erkek");
                break;
            case  "kadin":
                System.out.println("Kadin");
                break;
            default:
                System.out.println("Digerleri");
        }
    }
}
