package loops.calisma;

public class Soru03 {
    public static void main(String[] args) {
        /*
        Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır.
         */


        String str = "mahmut";// lenght=4 (2,3)(0,1)
        String tersStr="";


        for(int i = str.length()-1;i>-1; i--){

            String str1 = str.substring(i,i+1);


            tersStr = tersStr + str1;

        }



        if(str.equals(tersStr)){
            System.out.println("Palindrom");

        } else
            System.out.println("Palindrom degildir.");



        String isim = "anna";

        StringBuilder strbldr= new StringBuilder(isim);
        strbldr.reverse();
         String ters=  strbldr.toString();

        if(isim.equals(strbldr)){
            System.out.println("Palindrom");

        }else System.out.println("Palindrom degil");

    }
}
