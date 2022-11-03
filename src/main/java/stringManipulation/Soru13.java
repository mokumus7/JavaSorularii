package stringManipulation;

public class Soru13 {

    public static void main(String[] args) {

/*
Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir.
Şifrede en az 1 sembol olmalıdır.

 */

        String sifre = "Muhammet?12";

        boolean sart1 =sifre.replace(" ","").length()>7;

        boolean sart2 = sifre.replaceAll("[^\\p{Punct}]", "").length()>0;

        
       String sonuc = sart1 && sart2 ? "Sifre Gecerli": "Sifre Gecersiz.";

        System.out.println("sonuc = " + sonuc);
        
    }
}
