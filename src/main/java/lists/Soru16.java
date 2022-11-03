package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru16 {
    public static void main(String[] args) {

        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         */


        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        System.out.println(gunler);
        List<Integer> gunlukKazanclar = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int toplamKazanc = 0;
        int i = 1;
        while (i < 8) {
            System.out.println(i + ". gunun kazancini giriniz = ");
            int gunluk = input.nextInt();

            gunlukKazanclar.add(gunluk);
            toplamKazanc += gunluk;
            i++;
        }

        System.out.println("Toplam Kazanc = " + toplamKazanc);
        System.out.println(gunlukKazanclar);

        int ortalamaKazanc = getOrtalamaKazanc(toplamKazanc, 7);


        for (int k = 0; k < 7; k++) {

            getOrtalamaninUstundeKazancGünleri(gunlukKazanclar.get(k), ortalamaKazanc);

        }


    }

    public static int getOrtalamaKazanc(int a, int b) {
        return a / b;
    }


    public static int getOrtalamaninUstundeKazancGünleri(int a, int b) {
                return a;
    }
}