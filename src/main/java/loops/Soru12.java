package loops;

public class Soru12 {
    public static void main(String[] args) {

        /*
         Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
              A A A A A A A A
              A X X X X X X A
              A X X X X X X A
              A X X X X X X A
         */

         int satir = 4;
         int sutun = 8;

            for (int i = 1; i<satir+1;i++){
                if (i==1){
                    for(int a =1;a<sutun+1;a++){
                        System.out.print("A ");
                    }
                }else {
                    System.out.println();
                    for(int b =1; b<sutun+1;b++){
                         if(b==1 || b==sutun){
                             System.out.print("A ");
                         }else System.out.print("X ");
                    }
                }


            }








            }

        }


