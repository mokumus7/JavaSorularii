package calismaifstatement;

public class Calisma {
    public static void main(String[] args) {


        // verilen sayi cift ise ekrana cift, tek ise tek yazdırın.


        int a = 12;

        if(a % 2 == 0){

            System.out.println("Cift");

        } else {
            System.out.println("Tek");
        }


        // verilen sayi pozitifse ekrana pozitif, negatifse ekrana negatif  sıfır ise ekrana notr yazdirin.


        int b= 0;

        if(b>0){

            System.out.println("Pozitif");

        } else if (b==0) {
            System.out.println("Notr");

        }else {
            System.out.println("Negatif");
        }



        //verilen sayi 23 den kucukse sayiya bakin, sayi 16 dan buyukse oley, 16 dan kucukse bravo yazdirin.
        //verilan sayi 23 den buyukse sayiya bakin, sayi 30 dan kucuksa aferin, 30 dan buyukse yuppi yazdirin.
        // verilen sayi 23 ise ekrana sayi 23dur yazdirin

        int c=33;

        if(c<23){

            if(c>16){
                System.out.println("oley");
            } else if (c<16) {
                System.out.println("bravo");
            }


        } else if (c>23) {

            if(c<30){
                System.out.println("aferin");
            } else if (c>30) {
                System.out.println("yuppi");

            }

        } else{
            System.out.println("sayi 23 dur");

        }



        //verilen sayi 30 dan kucukse ve 17 den buyukse ekrana  guzel sayi yazdirin
        // && ---> ve    || ---> veya

        int d= 23;

        if(d<30 && d>17){
            System.out.println("guzel sayi");
        }


        //girinlen yas 65 den buyukse veya 18 den kucukse ekrana calisma caginda degildir yazdirin.

        int yas = 15;

        if(yas>65 || yas<18){
            System.out.println("calisma caginda degildir.");
        }

   //kisinin isminin ilk harfi A ise tebrikler yazdirin.
        String isim = "Ahmet";

        if(isim.charAt(0)=='A'){
            System.out.println("tebrikler");
        }
    }
}
