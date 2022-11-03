package loops;

public class Soru10 {
    public static void main(String[] args) {
        /*
        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
           işaretiyle yazdırmak için gereken kodu yazınız.
           Örneğin; 75.4238 ´ *4*2*3*8
         */


        double sayi = 75.4238;

        String sayiString = String.valueOf(sayi);

       String sonSAyi = sayiString.split("\\.")[1];
        System.out.println(sonSAyi);

        for(int i = 0; i<sonSAyi.length(); i++){

            char ch =sonSAyi.charAt(i);
            System.out.print("*"+ ch);

        }
    }
}
