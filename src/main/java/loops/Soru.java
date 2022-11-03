package loops;

public class Soru {
    public static void main(String[] args) {

        // Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321” palindromlardır

        String str ="annaa";
        String ters = "";

        for (int i = str.length()-1 ; i>-1; i--) {

            ters += str.charAt(i);

        }

        if(str.equals(ters)){

            System.out.println("Bu string palindromdur.");
        }else System.out.println("Bu string palindrom degildir.");

    }
}
