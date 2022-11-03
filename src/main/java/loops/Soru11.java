package loops;

public class Soru11 {
    public static void main(String[] args) {
        // Bir String’ i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM


        String duz = "Mark";
        String ters ="";

        for(int i = duz.length()-1;i>-1; i--) {
            String str = duz.substring(i,i+1);
              ters+=str;

        }
        System.out.println(ters);
    }
}
