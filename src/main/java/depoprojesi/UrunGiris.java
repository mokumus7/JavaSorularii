package depoprojesi;


import java.util.Collection;
import java.util.Scanner;
import java.util.Set;

public class UrunGiris {



    // id'lerini SEt'in icine aldik.
    static Set<Integer> urunId = UrunTanimlama.urunler.keySet();



    static Scanner input = new Scanner(System.in);
    public static void urunGirisi() {
        System.err.println(" # Urun Giris Sayfasi #");


        System.out.println("Id Numarasi Giriniz = ");
        int id = input.nextInt();
        UrunTanimlama obje = UrunTanimlama.urunler.get(id);

      do {

          if(urunId.contains(id)){
              System.out.println("Miktar Giriniz = ");
              int miktar= input.nextInt();
              obje.setMiktar(obje.getMiktar()+miktar);

              System.out.println("Urun eklemeye devam etmek icin 1'e \n Anasayfaya donmek icin herhangi bir tusa basiniz...");
              int secim = input.nextInt();

              if(secim==1){
                  urunGirisi();
              }else {
                  DepoKarsilama.depoKarsilamaSayfasi();
              }


          }else{
              System.out.println("Olmayan id Girdiniz, Lütfen tekrar id giriniz = ");
              id=input.nextInt();

          }
      }while (true);















    }
}




























//        if(urunId.equals(id)) {
//
//            for (Integer w : urunId) {//100-101-102-103
//
//                if (w == id) {
//                    System.out.println("Miktar giriniz = ");
//                    int miktar = input.nextInt();
//
//                    obje.setMiktar(obje.getMiktar() + miktar);
//
//
//                    System.out.println("Urun eklemeye Devam Etmek istiyorsaniz 1'e\n Anasayfaya donmek icin 2'e basiniz");
//
//                    int secim = input.nextInt();
//
//                    do {
//                        if (secim == 1) {
//                            urunGirisi();
//                            break;
//                        } else if (secim == 2) {
//                            DepoKarsilama.depoKarsilamaSayfasi();
//                            break;
//                        } else {
//                            System.out.println("Yanlis secim yaptiniz. Tekrar giris yapiniz.");
//                            secim = input.nextInt();
//                        }
//                    } while (true);
//
//                    break;
//
//                }
//            }
//        }else {
//            System.out.println("Yanlis ID girdiniz|\n Tekrar giris yapiniz.");
//            id=input.nextInt();
//            for (Integer w : urunId) {//100-101-102-103
//
//                if (w == id) {
//                    System.out.println("Miktar giriniz = ");
//                    int miktar = input.nextInt();
//
//                    obje.setMiktar(obje.getMiktar() + miktar);
//
//
//                    System.out.println("Urun eklemeye Devam Etmek istiyorsaniz 1'e\n Anasayfaya donmek icin 2'e basiniz");
//
//                    int secim = input.nextInt();
//
//                    do {
//                        if (secim == 1) {
//                            urunGirisi();
//                            break;
//                        } else if (secim == 2) {
//                            DepoKarsilama.depoKarsilamaSayfasi();
//                            break;
//                        } else {
//                            System.out.println("Yanlis secim yaptiniz. Tekrar giris yapiniz.");
//                            secim = input.nextInt();
//                        }
//                    } while (true);
//
//                    break;
//
//                }
//            }
//        }
//
//        }
////            if (w!=id)  {
////                System.err.println("Yanlis id Girdiniz !");
////
////                System.out.println("Urun eklemeye Devam Etmek istiyorsaniz 1'e\n Anasayfaya donmek icin 2'e basiniz");
////                int secim = input.nextInt();
////
////                do {
////                    if(secim==1){
////                        urunGirisi();
////                        break;
////                    } else if (secim==2 ) {
////                        DepoKarsilama.depoKarsilamaSayfasi();
////                        break;
////                    }else {
////                        System.out.println("Yanlis secim yaptiniz. Tekrar giris yapiniz.");
////                        secim= input.nextInt();
////                    }
////                }while(true);
////
////            }












