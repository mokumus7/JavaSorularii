package loops;

public class SOru24 {
    public static void main(String[] args) {

        /*
        5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız
         */

        int toplam = 0;
        for(int i =3; i<10; i++){

            if(i==5){
                continue;
            }

            System.out.print(i + " ");
            toplam+=i;
        }
        System.out.println();
        System.out.println(toplam);
    }
}
