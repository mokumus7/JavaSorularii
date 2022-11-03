package loops;

public class Soru06 {
    public static void main(String[] args) {
/*
 Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.

        A
        A A
        A A A
        A A A A

 */
   //1.YOL

        for(int i = 1; i<5 ; i++){

            for(int a =1;a<=i; a++){
                System.out.print("A ");
            }
            System.out.println();
        }

        System.out.println();
     //2.YOL

     int a = 1;

        while (a<5){
            int b =1;
                while (b<=a){
                    System.out.print("A ");
                    b++;
                }
            System.out.println();
        a++;
        }


    }
}
