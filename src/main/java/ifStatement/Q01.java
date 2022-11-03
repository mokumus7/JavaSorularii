package ifStatement;

public class Q01 {
    public static void main(String[] args) {



        int a = 12;


        if(a>=0){

            if(a%2==0){
                System.out.println("cift");
            } else if (a%2!=0){
                System.out.println("tek");
            }else
                System.out.println("sayi giriniz");

        }else
            System.out.println("Pozitif sayi giriniz");




    }
}
