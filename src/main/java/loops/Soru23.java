package loops;

public class Soru23 {
    public static void main(String[] args) {
        /*
         Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
              Örnek:12133455 ´ 2+4=6
         */


        int a = 12312345;

        String strA = String.valueOf(a);
        String bos = "";
        for (int i = 0;i<strA.length(); i++) {

            String s = strA.substring(i,i+1);
                 if(strA.indexOf(s)==strA.lastIndexOf(s)){
                     bos+=s;
                 }
        }int sayiA= Integer.valueOf(bos);

        System.out.println(sayiA%10+((sayiA/10%10)));






    }
}
