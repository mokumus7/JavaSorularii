package mentorSorular;

import java.util.Scanner;

public class Soru06 {
    public static void main(String[] args) {

        /*
        Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.
        ax^2 + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("x^2 li ifadenin katsayisini giriniz : ");
        int a = input.nextInt();
        System.out.println("x'li ifadenin katsayisini giriniz : ");
        int b = input.nextInt();
        System.out.println("sabit sayi giriniz : ");
        int c = input.nextInt();

        int delta = b*b-4*a*c;
        double kok1 = -b/2*a;
        double kok2 =(-b + Math.sqrt(delta)) / (2*a);
        double kok3 = (-b - Math.sqrt(delta)) / (2*a);
        if(delta < 0) {
            System.out.println("Kok yoktur.");
        } else if (delta==0) {
            System.out.println("1 tane kok vardir :"+ "x1 = " +kok1);

        } else if (delta>0) {
            System.out.println("Iki tane kok vardir: " + "x1 = " + kok2 + "   x2 = " + kok3);

        }
    }
}
