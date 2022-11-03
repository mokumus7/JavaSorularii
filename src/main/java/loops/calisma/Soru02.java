package loops.calisma;

public class Soru02 {
    public static void main(String[] args) {
        //Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        
        String isim = "muhammet";// 8 karekterlidir. sonuncu indexi 7.

        String tekrarlananKarekterler ="";


        for(int i =0; i<isim.length(); i++){

          String ch =isim.substring(i,i+1);

           if( isim.indexOf(ch)!=isim.lastIndexOf(ch)){

               if(!tekrarlananKarekterler.contains(ch)){

                   tekrarlananKarekterler+=ch;
               }

           }

        }

        System.out.println("tekrarlananKarekterler = " + tekrarlananKarekterler);
    }
}
