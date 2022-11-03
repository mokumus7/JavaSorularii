package loops;

public class Soru19 {
    public static void main(String[] args) {
        //Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
//1.Yol
    int a = 1568;
    int toplam = 0 ;

    for(int i = a; i>0 ; i=i/10){

          toplam+=i%10;
    }
        System.out.println(toplam);



//2.Yol
    int b = 12546;
    int sum = 0;

    int c=b;
    while (c>0){
        sum+=c%10;
        c=c/10;
    }

        System.out.println(sum);



    //3.yol


        int k= 785412;

        int sonuc= 0;
        do {
            sonuc+=k%10;
            k/=10;
        }while(k>0);
        System.out.println(sonuc);
    }
}
