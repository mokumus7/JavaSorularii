package stringManipulation;

public class Soru10 {

    public static void main(String[] args) {
        
        /*
        Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.
         */
        
        String isim = "Muhammet okumus";
        
        boolean aaa =isim.contains(" ");

        System.out.println("aaa = " + aaa);
    }
}
