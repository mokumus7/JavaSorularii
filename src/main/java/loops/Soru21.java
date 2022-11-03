package loops;

public class Soru21 {
    public static void main(String[] args) {

        //Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.

        String str = "Bir stringde ne kadar noktalama isareti olabilir ki ?????";

      int a =  str.replaceAll("[\\p{Punct}]","").replaceAll("[ ]","").length();
        System.out.println( + a);


        System.out.println(str.replaceAll("\\s",""));

    }
}
