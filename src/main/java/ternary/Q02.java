package ternary;

public class Q02 {
    public static void main(String[] args) {


        //carpma islemi... 2 sayinin isartleri ayniysa sayilar carp farkliysa carpma yapilamaz yazdir.

        int a = 10;
        int b =- 5;



   Object sonuc =  ( a>0 && b>0) || ( a<0 && b<0) ? a*b : "Carpma yapilamaz" ;

        System.out.println(sonuc);


    }
}
