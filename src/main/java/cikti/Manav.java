package cikti;

import java.util.Scanner;
/*
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */


public class Manav {



    public static double toplam =0;

    public static void main(String[] args) {

        System.out.println("# OKUMUS MANAVA HOSGELDİNİZ #");

        manav();

     //main method'da sadece manav() methodunu calistiriyoruz.

    }


    //Manav Methodumuz
        public static void manav(){
            Scanner input = new Scanner(System.in);


            System.out.println("  \n"+
                    "1. Meyveler\n"+
                    "2. Sebzeler\n"+
                    "Lutfen kategori numarasi giriniz : ");

            byte secim = input.nextByte();

            if(secim==1){

                meyveler();


            } else if (secim==2) {

                sebzeler();


            }else {
                System.out.println("Lutfen gecerli bir kategori numrasi giriniz\n"+
                        "1. Meyveler\n"+
                        "2. Sebzeler\n");
            }

        }




//Sebzeler Methodumuz
      public static void sebzeler(){

          Scanner input = new Scanner(System.in);

    System.out.println("Sepete eklemek istediginiz urunun kodunu giriniz = ");

    String sebzeler =
            "1. Domates-----> 10.99 TL\n"+
            "2. Salatalik---> 7.40 TL\n"+
            "3. Biber-------> 16.50 TL\n"+
            "4. Soğan-------> 4.30 TL\n"+
            "5. Havuç-------> 6.10 TL\n";

    System.out.println(sebzeler);

    int sebzeSecim = input.nextInt();

    System.out.println("Kac kilogram istediginizi giriniz = ");

    int sebzeKgSecim= input.nextInt();

   double sebzeToplamFiyat=0;


    switch(sebzeSecim) {
        case 1:
           sebzeToplamFiyat+=10.99*sebzeKgSecim;
           break;
        case 2:
            sebzeToplamFiyat+=7.40*sebzeKgSecim;
            break;
        case 3:
            sebzeToplamFiyat+=16.50*sebzeKgSecim;
            break;
        case 4:
            sebzeToplamFiyat+=4.30*sebzeKgSecim;
            break;
        case 5:
            sebzeToplamFiyat+=6.10*sebzeKgSecim;
            break;
        default:
            System.out.println("Lutfen gecerli bir secim yapiniz.");
    }

    System.out.println("Son secilen urunun fiyati = " + sebzeToplamFiyat);
         toplam+= sebzeToplamFiyat;


    System.out.println("Sepete baska urun eklemek icin  1'e\nAlisverisi sonlandirip odeme yapmak icin 2'ye basin");
     int a = input.nextInt();

     if(a==1){
       manav();

     } else if (a==2) {
        kasa();
     }else {
         System.out.println("Lutfen gecerli bir secim yapiniz.");
     }

}
 //Meyveler Methodumuz
    public static void meyveler(){

        Scanner input = new Scanner(System.in);

        System.out.println("Sepete eklemek istediginiz urunun kodunu giriniz = ");

        String meyveler =
                        "1. Muz---------> 16.75 TL\n"+
                        "2. Mandalina---> 8.40 TL\n"+
                        "3. Elma--------> 6.50 TL\n"+
                        "4. Armut-------> 14.30 TL\n"+
                        "5. Nar---------> 9.90 TL\n";

        System.out.println(meyveler);



        int meyveSecim = input.nextInt();

        System.out.println("Kac kilogram istediginizi giriniz = ");

        int meyveKgSecim= input.nextInt();

        double meyveToplamFiyat=0;



        switch(meyveSecim) {
            case 1:
                meyveToplamFiyat+=16.75*meyveKgSecim;
                break;
            case 2:
                meyveToplamFiyat+=8.40*meyveKgSecim;
                break;
            case 3:
                meyveToplamFiyat+=6.50*meyveKgSecim;
                break;
            case 4:
                meyveToplamFiyat+=14.30*meyveKgSecim;
                break;
            case 5:
                meyveToplamFiyat+=9.90*meyveKgSecim;
                break;
            default:
                System.out.println("Lutfen gecerli bir secim yapiniz.");
        }

        System.out.println("Son secilen urunun fiyati = " + meyveToplamFiyat);
        toplam+=meyveToplamFiyat;


        System.out.println("Sepete baska urun eklemek icin  1'e\nAlisverisi sonlandirip odeme yapmak icin 2'ye basin");
        int a = input.nextInt();

        if(a==1){
            manav();

        } else if (a==2) {
           kasa();
        }else {
            System.out.println("Lutfen gecerli bir secim yapiniz.");
        }


    }

    //kasa methodumuz

public static void kasa(){

    System.out.println("OKUMUS manavdan alisveris ettiginiz icin tesekkur ederiz \nToplam borcunuz = "+ toplam);
}


}
