package stringManipulation;

public class Soru08 {
    public static void main(String[] args) {

        /*Bir String değişkeni oluşturunuz ve son karakteri 
        dışındaki tüm karakterlerini konsolda  büyük harfle yazdırınız.
         */
       
        String ad = "Muhammet";
        
       String add =  ad.substring(1,8).toUpperCase();

        System.out.println("add = " + add);
    }
}
