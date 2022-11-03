package loops;

public class Soru09 {

    public static void main(String[] args) {

        /*
         String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
                   Örneğin; 'Ali Can?' ==> l*i*a*n*
         */

        String str = "Ali Can?";

        for(int i =0; i<str.length();i++){
           char ch = str.charAt(i);
                if (ch>='a' && ch<='z'){
                    System.out.print(ch+"*");
                }
        }

        System.out.println();

        String sss = "Ali Can?";
        String sonuc = "";
         for (int a =0; a<sss.length();a++ ){
             
             char c = sss.charAt(a);
             
             if(c>='a' && c<='z'){
                 sonuc= sonuc+"*";
             }else {
                 sonuc=sonuc+c;
             }
         }

        System.out.println("sonuc = " + sonuc);
    }
}
