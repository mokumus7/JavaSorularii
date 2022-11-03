package loops;

public class Soru15 {

    public static void main(String[] args) {

        /*
         Do-while döngüsünü kullanarak konsolda 'C' ile 'A'
         arasındaki karakterleri yazdırmak için kod yazınız
         */

       char ch = 'C';
       String ss="";

        do {
         ss+=ch;
           ch--;
       }while (ch>='A');

        System.out.print(ss);

    }
}
