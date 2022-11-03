package stringManipulation;

public class Soru17replaceAll {
    public static void main(String[] args) {
        
        //Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
        
        String str = "M/h*mmet..?ok,,";
        
      int nmr =  str.replaceAll("[^\\p{Punct}]","").length();

        System.out.println("nmr = " + nmr);
    }
}
