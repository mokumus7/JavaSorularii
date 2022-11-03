package switch01;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


        //1-10 arasindaki sayilaarin durumlarini yazınız----asal, tek yada cift


        Scanner input = new Scanner(System.in);
        System.out.println("1-10 arasinda bir sayi giriniz = ");

        byte sayi = input.nextByte();

        switch (sayi) {
            case 3:
            case 7:
            case 5:
                System.out.println("Girin sayi asal sayidir.");
            case 1:
            case 9:
                System.out.println("Girilen sayi tek sayidir.");
                break;
            case 2:
                System.out.println("Girin sayi asal sayidir.");
            case 6:
            case 4:
            case 8:
            case 10:
                System.out.println("Girilen sayi cift sayidir.");
                break;
            default:
                System.out.println("Lutfen 1-10 arasinda bir sayi giriniz.");


        }

    }
}
