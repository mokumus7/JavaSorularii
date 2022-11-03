package loops;

public class Soru14 {
    public static void main(String[] args) {
//3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız

        int carpim =1;
        for(int i =3; i<10; i++){
            carpim*=i ;
        }

        System.out.println(carpim);
    }
}
