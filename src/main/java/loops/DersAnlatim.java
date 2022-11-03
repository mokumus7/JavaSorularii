package loops;

import java.util.Scanner;

public class DersAnlatim {
    public static void main(String[] args) {

        /*
Kullanicidan 100 den kucuk bir tamsayi isteyin. 1'den baslayarak
girilen sayiya kadar tum sayilari yazdirin. Ancak:
-Sayi 3 un kati ise sayi yerine "Java" yazdirin
-Sayi 5 in kati ise sayi yerine "Guzeldir" yazdirin
-Sayi hem 3'un hem de 5'in kati ise sayi yerine "Java Guzeldir" yazdirin
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Yuzden kucuk bir sayi giriniz");
        int sayi = input.nextInt();

        if (sayi < 100 && sayi > 0) {
            for (int i = 1; i < sayi + 1; i++) {

                   if(i%15==0){
                       System.out.println("Java Guzeldir");
                   }else if (i%5==0) {
                    System.out.println("Guzeldir");
                } else if (i%3==0) {
                       System.out.println("java");
                   }else System.out.println(i);

                }
            }else System.out.println("yahu 100 den kucuk sayi gir demedik mi? ");
        }
    }
