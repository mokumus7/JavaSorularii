package mentorSorular;

import java.util.Scanner;

public class Soru10 {

    public static void main(String[] args) {
        // Kullanıcıdan bir pozitif tamsayı girmesini isteyin,
        // o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise
        // “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

        Scanner input = new Scanner(System.in);

        System.out.println("Pozitif bir tam sayi girin");

        int number = input.nextInt();
        
       boolean cift = number%2==0;

        String str = "" + number;

       int basamak = str.length();

        
      String sonuc =  basamak==3 ?"3 basamakli":(cift ? "Uc basamakli olmayan cift sayi":"Uc basamakli olmayan tek sayi");

        System.out.println("sonuc = " + sonuc);






    }
}
