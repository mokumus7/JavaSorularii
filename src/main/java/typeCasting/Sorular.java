package typeCasting;

public class Sorular {
    public static void main(String[] args) {

        /*
                Short data tipinde bir değişken oluşturunuz
                 ve onu bir int değişkenine dönüştürünüz.


         */

        short yas=13;
        int yas1=yas;

        /*
        Long data tipinde bir değişken oluşturunuz ve
         onu bir int değişkenine dönüştürünüz.
         */

        long n1=123L;
        int n2=(int)n1;

        /*
        Double data tipinde bir değişken oluşturunuz ve
        onu bir float değişkenine dönüştürünüz.
         */

        double n3= 13.99;
        float n34=(float) n3;
        
        /*
        Double data tipinde bir değişken oluşturunuz ve onu bir
         short değişkenine dönüştürünüz.
         Sonrasında bu short değişkenin değerini konsolda yazdırınız. 
         */

        double nmb=15.987;
        short nmb1=(short) nmb;
        System.out.println("nmb1 = " + nmb1);
    }
}
