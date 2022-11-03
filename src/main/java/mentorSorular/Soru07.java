package mentorSorular;

import java.util.Scanner;

public class Soru07 {

    public static void main(String[] args) {

        /*
        Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve
    en kucuk olanlarini konsola yazdiriniz
          int num1
          int num2
          int num3
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Uc numara giriniz : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2) {

            if (num1 > num3) {
                System.out.println("En buyuk numara = " + num1);
                if (num2 > num3) {
                    System.out.println("En kucuk numara = " + num3);
                } else if (num2 < num3) {
                    System.out.println("En kucuk numara = " + num2);
                } else if (num1 < num3) {
                    System.out.println("En buyuk numara = " + num3);
                }

            } else if (num1 < num3) {
                System.out.println("En buyuk numara = " + num3);
                System.out.println("En kucuk numara = " + num2);

            }

        } else if (num1 < num2) {
            if (num2 < num3) {
                System.out.println("En buyuk numara = " + num3);
                System.out.println("En kucuk numara = " + num1);
            } else if (num2 > num3) {

                if (num1 < num3) {
                    System.out.println("En buyuk numara = " + num2);
                    System.out.println("En kucuk numara = " + num1);

                } else if (num1 > num3) {
                    System.out.println("En buyuk numara = " + num2);
                    System.out.println("En kucuk numara = " + num3);
                }

            }
        }
    }
}