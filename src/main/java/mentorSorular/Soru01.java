package mentorSorular;

import java.util.Scanner;

public class Soru01 {

    public static void main(String[] args) {

        /* TASK :
        1.Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner input= new Scanner(System.in);

        //1.yol.. sayi oldugu ıcın int tanımlarız.
        System.out.println("Lütfen günü giriniz : ");

        int gün= input.nextInt();

        System.out.println("Lütfen ay giriniz : ");

        int ay = input.nextInt();

        System.out.println("Lütfen yılı girin : ");

        int yil = input.nextInt();

        System.out.println("Gün ay yıl : "+gün+"."+ay+"."+yil);
        System.out.println("Yıl ay gün : "+yil+"."+ay+"."+gün);

        //2.yol--- islem yapmayacagımız ıcın String de tanımlayabiliriz.
        System.out.println("Lütfen günü giriniz : ");
        String g= input.next();
        System.out.println("Lütfen ay giriniz : ");
        String a= input.next();
        System.out.println("Lütfen yılı girin : ");
        String y= input.next();

        System.out.println("Gün ay yil : " + g +"." +a+ "." + y);
        System.out.println("Yil ay gün : " + y +". "+a+ "." + g);


    }
}
