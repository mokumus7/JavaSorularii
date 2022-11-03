package stringManipulation;

public class Soru12 {

    public static void main(String[] args) {

       /* Bir String’ in başında büyük harf ve sonunda 
       nokta olup olmadığını kontrol etmek için kod yazınız.
        */
        
        
        String isim ="MuhammeT Okumuş.";
        
       char ilk = isim.charAt(0);

       if(ilk>='A' && ilk<='Z'){
           System.out.println("Ilk harf buyuk Harf.");
       }else {
           System.out.println("Ilk harfk buyuk harf degildir. :)");
       }

        char son = isim.charAt(isim.length()-1);
       if(son=='.'){
           System.out.println("Son karekter noktadır.");
       }else{
           System.out.println("Son karekter nokta degildir.");
       }


    }
}
