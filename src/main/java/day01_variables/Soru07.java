package day01_variables;

import java.util.Scanner;

public class Soru07 {
    public static void main(String[] args) {

        /* Kullanicidan iki tam sayi isteyiniz. sonra
        İki tamsayıyı değiştirmek için bir kod yazınız.

        */

        Scanner input= new Scanner(System.in);

        System.out.println("Iki tam sayi giriniz : ");

        int sayi1=input.nextByte();
         int sayi2=input.nextByte();

        System.out.println("Sayi1 = " + sayi1);
        System.out.println("Sayi2 = " + sayi2);

//        int degistir=sayi1;
//        sayi1=sayi2;
//        sayi2= (byte) degistir;
//
//        System.out.println("Sayi1 = " + sayi1);
//        System.out.println("Sayi2 = " + sayi2);

        sayi1 =sayi1 + sayi2;
        sayi2= sayi1-sayi2;
        sayi1= sayi1-sayi2;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);



    }
}

