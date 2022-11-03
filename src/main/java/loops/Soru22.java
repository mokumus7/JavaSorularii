package loops;

public class Soru22 {
    public static void main(String[] args) {

        /*
         Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
            * * * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
         */


        int sutun = 6;

        for(int i =1 ; i<7; i++){

               for (int a =sutun; a>=i;a--){
                   System.out.print("*" +" ");
               }
            System.out.println();
        }


    }
}
