package switch01;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {

        /*
        Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
                  Örnek: 2000 yılının Şubat ayında gün sayısı 29.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Yil girinizi : ");
        int yil= input.nextInt();

        System.out.println("Ay giriniz : ");

        int ay = input.nextInt();

                switch (ay){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case  8:
                    case 10:
                    case 12:
                        System.out.println("31");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("30");
                        break;
                    case 2:

                        if(yil%4!=0) {
                            System.out.println("28");
                        }else System.out.println("29");
                        break;
                    default:
                        System.out.println("Gecerli ay adi giriniz!..");
                }
                }



    }

