package loops;

public class Soru01 {

    public static void main(String[] args) {

        /*
        120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen
        tüm tam sayıları aynı satırda iki ardışık tam sayı arasında boşluk bırakarak yazınız
         */

        //1.Yol
        for (    int i = 120  ;     i > 10     ;    i--     ) {


            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print("  " + i);
            }

        }

        System.out.println();
        //2.yol
        int i = 120;

        while (i > 10) {

            if (i % 12 == 0) {
                System.out.print(" " + i);
            }
            i--;
        }

        System.out.println();

        //3.Yol
        int a = 120;

        do {
            if (a % 12 == 0) {
                System.out.print(" " + a);
            }

            a--;
        } while (a > 10);


    }

}
