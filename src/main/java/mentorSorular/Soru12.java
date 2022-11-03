package mentorSorular;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) +++
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)++++
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.++++
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.++++++
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */


        Scanner input = new Scanner(System.in);

       List<String> gunler = new ArrayList<>();
       
       gunler.add("Pazartesi");
       gunler.add("Sali");
       gunler.add("Carsamba");
       gunler.add("Persembe");
       gunler.add("Cuma");
       gunler.add("Cumartesi");
       gunler.add("Pazar");

        System.out.println("gunler = " + gunler);

        List<Double> gunlukKazanclar = new ArrayList<>();


        int i=1;
        double toplamKazanc=0;

        while(i<8){

            System.out.println( i + ". gun kazancini giriniz = ");
            double gunlukKazanc =input.nextDouble();
            gunlukKazanclar.add(gunlukKazanc);
            toplamKazanc=toplamKazanc+gunlukKazanc;
           i++;
        }

        System.out.println("Toplam Kazanc = " + toplamKazanc);
        System.out.println(gunlukKazanclar);


        System.out.println("Ortalama Gunluk Kazanc = " + getOrtalamaKazanc(toplamKazanc, 7));





    }

    public static double getOrtalamaKazanc(double a, double b){

      return a/b;
    }


    public static double getOrtalamaninUstundeKazancGünleri(Double a,double b) {

                        return a;

    }





}
