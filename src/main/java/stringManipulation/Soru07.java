package stringManipulation;

public class Soru07 {
    public static void main(String[] args) {

        /*
        Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki
         tüm karakterleri konsolda yazdırınız.
         */

        String deger = "Muhammet";

        String yazdir =deger.substring(1,8);

        System.out.println("yazdir = " + yazdir);
        
        String sss= deger.replace("M","");

        System.out.println("sss = " + sss);


    }

}
