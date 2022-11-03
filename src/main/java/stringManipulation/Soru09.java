package stringManipulation;

public class Soru09 {
    public static void main(String[] args) {

        /*
        Bir String degisken olusturun. ilk ve son karekter dısındaki butun karekterleri buyuk harfle yazdırın.
         */
        
        String isim = "Muhammet";
        
        String isim1 =isim.substring(1,7).toUpperCase();

        System.out.println("isim1 = " + isim1);
    }
}
