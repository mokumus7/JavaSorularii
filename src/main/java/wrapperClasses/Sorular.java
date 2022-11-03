package wrapperClasses;

public class Sorular {

    public static void main(String[] args) {

        /*
        Byte data tipinin minimum değeri ile
        short data
        tipinin maksimum değerinin toplamını
        bulmak için bir kod yazınız.
         */
//
//        System.out.println(Byte.MIN_VALUE);
//        System.out.println(Byte.MAX_VALUE);

        /*
        Data tipi String olan “103” değerini byte data tipine
         dönüştürmek için bir kod yazınız ve yine data tipi String olan
         “2351” değerini short data tipine dönüştürüp konsolda
         iki değişken arasındaki farkı yazdırınız.
         */


        //Note : String bir degerin sayısal degerini primitive data type'larina
        //       aktarmak icin, 'valueOf()' ifadesinden yararlaniriz.
        String deger="103";
        byte yeniDeger=Byte.valueOf(deger);
       int n1= Integer.valueOf(deger);

        System.out.println(deger);
        System.out.println("yeniDeger = " + yeniDeger);

        String deger1="2351";
        short yDeger= Short.valueOf(deger1);

        System.out.println("String = "+ deger);
        System.out.println("byte = "+ yeniDeger);

        System.out.println("String2 = "+ deger1);
        System.out.println("Short = "+ yDeger);

    }

}
