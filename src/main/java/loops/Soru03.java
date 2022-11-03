package loops;

public class Soru03 {
    public static void main(String[] args) {
 /*
 Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız.
  Bir String, tersi ile aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
  */


        String duz = "kavak";

        String ters ="";

        //1.YOL

        for(int i =duz.length()-1; i>-1  ; i--){
            String str = duz.substring(i,i+1);
            ters= ters+str;
            }
        if (duz.equals(ters)){
            System.out.println("Palindrom");
        }else
            System.out.println("Palindrom degildir.");


        //2.YOL

        String a = "oppo";
        String bos ="";

        int b = a.length()-1;
        while (b>-1){
            char chr = a.charAt(b);
            bos=bos+chr;
          b--;
        }


      String sonuc =  a.equals(bos) ? "palindrom":"palindrom degildir";
        System.out.println(sonuc);


      //3.YOL

        String c ="anna";
        String tersC= "";

        int f = c.length()-1;

        do {
            String d = c.substring(f,f+1);
            tersC= tersC+d;
         f--;
        }while (f>-1);

        if (c.equals(tersC)){
            System.out.println("Palindrom--do");
        }else System.out.println("Palindrom degildir--do");







    }
}
