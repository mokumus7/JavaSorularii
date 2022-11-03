package ternary;

import java.util.Scanner;

public class Soru07 {
    public static void main(String[] args) {

 //Ternary kullanarak; 2 tamsayıdan küçük olanı konsola yazdıran bir program yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Iki tam sayi giriniz : ");
        int a= input.nextInt(), b= input.nextInt();
        
      int c =   a<b ? a:b;
        System.out.println("c = " + c);
        

    }
}
