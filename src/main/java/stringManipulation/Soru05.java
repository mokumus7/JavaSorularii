package stringManipulation;

public class Soru05 {

    public static void main(String[] args) {

        /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız
         */

        String aaa = "adasdasdxm";

//        //1.Yol
        char sonKarekter = aaa.charAt(aaa.length() - 1);


        if (sonKarekter == ' ') {

        } else {
            System.out.println("sonKarekter = " + sonKarekter);
        }


        //2.Yol

        char bb = aaa.charAt(aaa.length() - 1);
        switch (bb) {
            case ' ':
                break;
            default:
                System.out.println("Son karekter = " + bb);

                //3. yol
                char sonHarf1 = aaa.charAt(aaa.length() - 1);
                boolean asd = aaa.charAt(aaa.length() - 1) == ' ';

                Object sonHarf = asd ? "" : asd;

                System.out.println("sonHarf = " + sonHarf1);


        }

    }
}
