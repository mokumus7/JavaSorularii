package ifStatement;


import java.util.Scanner;

public class Soru12 {
    /*
    Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
         yazınız.
           Geçersiz BMI değeri < 0
           Zayıf = <18.5
           Normal ağırlık = 18.5–24.9
           Fazla kilolu = 25–29.9
           Obezite = 30 veya daha büyük BMI
 */

    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
        System.out.println("Bmi degerinizi giriniz");
      double bmi = input.nextDouble();
        
        
      if(bmi<0){
          System.out.println("Geçersiz BMI değeri");
    } else if (bmi<15.5) {
          System.out.println("Zayıf");
      } else if (bmi>15.5 && bmi<24.9) {
          System.out.println("Normal ağırlık");
      } else if (bmi>=30) {
          System.out.println("Obezite");
      } else if (bmi>=25 && bmi<=29.9) {
          System.out.println("Fazla kilolu");
      } else
          System.out.println("Geceerli bir bmi degeri giriniz...");

    }
    
}