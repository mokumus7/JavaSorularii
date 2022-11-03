package depoprojesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Urun {
     static Scanner input =new Scanner(System.in);
    public static List<String> urunISmi = new ArrayList<>();
    public static List<String> urunBirim = new ArrayList<>();
      public static List<String> ureticiFirma = new ArrayList<>();
      public static List<String> urunId  = new ArrayList<>();
      public static List<Integer> rafNo = new ArrayList<>();




    public static void depoKarsilamaSayfasi(){
        System.err.println("#  OKUMUS DEPO ANASAYFA  #");


        System.out.println(" 1. Urun Tanimlama\n" +
                           " 2. Urun Rafa Koy\n " +
                           " 3. Urun Giris\n"     +
                           " 4. Urun Cikis\n"     +
                           " 5. Urun Listele\n"   +
                "Yapmak istediginiz islemi seciniz");

        int secim= input.nextInt();

        switch(secim){
            case 1:
                urunTanimlama();
                break;
            case 2:
                urunRafaKoy();
                break;
            case 3:
                urunGiris();
                break;
            case 4:
                urunCikis();
                break;
            case 5:
                urunListele();
                break;
            default:
                System.err.println("Gecerli Bir İslem Seciniz");
        }


    }
    public static void urunTanimlama(){

        System.out.println("Urun isminiz giriniz = ");
        urunISmi.add(input.nextLine());
        System.out.println("Urun birimini giriniz =  (adet-kg-litre) ");
        urunBirim.add(input.nextLine());
        System.out.println("Uretici Firma giriniz = ");
        ureticiFirma.add(input.nextLine());

        int i =0;
        int a=100;
        String id= urunISmi.get(i).substring(0,2)+ureticiFirma.get(i).substring(0,2)+a;
        i++;
        a++;

        urunId.add(id);

        System.out.println("Urun Tanimlamaya devam etmek icin 1'e\n"+
                           "Anasayfaya donmek icin 2'ye basin ");

        int scm =input.nextInt();

        switch (scm) {
            case 1:
                urunTanimlama();
                break;
            case 2:
                depoKarsilamaSayfasi();
                break;
            default:
                System.err.println("Gecerli Bir İslem Seciniz");
        }



    }

    public static void urunRafaKoy(){

    }

    public static void urunGiris(){

    }

    public static void urunCikis(){

    }

    public static void urunListele(){
        System.err.println("\t\t\t\t\t\t\t# URUN LİSTELEME #");
        System.out.println("_____________________________________________________________________________________");
        System.out.println("\tID\t\t\tİSİM\t\t\tURETİCİ\t\t\tMİKTAR\t\t\tBİRİM\t\t\tRAF\t");
        System.out.println("-------------------------------------------------------------------------------------");

    }
}
