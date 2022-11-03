package preclasssorulari;

public class Soru006 {
    public static void main(String[] args) {

        // 3 basamakli sayilardan 15,20 ve 90 a tam bolunenleri yazdirin



        for (int i =100; i<1000; i++ ){
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.println(i);

            }

        }
    }
}
