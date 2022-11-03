package switch01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("icinde bulundugunuz ay ismini giriniz");

        String ayIsmi = input.next().toLowerCase();


        switch (ayIsmi) {

            case "ocak" :
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralık":
                System.out.println("aralik");
                break;
            default:
                System.out.println("Gecerli bir ay ismi giriniz");
        }
    }
}