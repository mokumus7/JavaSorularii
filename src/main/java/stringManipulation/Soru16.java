package stringManipulation;

public class Soru16 {

    public static void main(String[] args) {

        /*
        Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.

         */

        String tamIsim = "Muhammet Okumuş";

        char ilk =tamIsim.charAt(0);

        char son = tamIsim.split(" ")[1].charAt(0);

        System.out.println("" +ilk+son);

    }
}
