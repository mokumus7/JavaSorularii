package ifStatement;

import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args) {

        //Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        // a)  Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi:
        // “Son basamağı bir üst ondalığa yuvarla”
        // b) Son basamak 5 den küçükse, yuvarlama işlemi:
        // “Son basamağı bir alt ondalığa yuvarla”
        Scanner input= new Scanner(System.in);

        System.out.println("Bir sayi giriniz : ");
        int sayi = input.nextInt();

        //527 527+(10-7)
        if(sayi % 10 > 4){
            System.out.println(sayi+(10-sayi%10));
            //254-- 254-4
        } else if (sayi % 10<5) {
            System.out.println(sayi-(sayi%10));
        }

    }
}
