package loops;

public class Soru05 {

    public static void main(String[] args) {
        /*
         Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
          1 2 3 4 5
       1  A A A A A
       2  A A A A A
       3  A A A A A
         */


        //1.YOL

        for(int i = 1; i<4; i++){

            for(int a =1; a<6;a++){
                System.out.print("A ");
            }
            System.out.println();
        }


        System.out.println(" ");
     //2.YOL

     int a =1;

        while (a<4){
            int b =1;
            while (b<6){
                System.out.print("A ");
             b++;
            }

            System.out.println();

         a++;
        }

        System.out.println();
     //2.YOL

        int c=1;
        do {
            int d = 1;
            do {
                System.out.print("A ");
                d++;
            }while (d<6);
            System.out.println();
            c++;
        }while(c<4);




    }
}
