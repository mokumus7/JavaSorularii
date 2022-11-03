package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        //Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
        //büyük öğeler arasındaki farkı konsolda yazdırınız.


        Scanner input = new Scanner(System.in);
        System.out.println("Kac tam sayi gireceksiniz?");

        int adet =input.nextInt();

        int numbers[]  =new int[adet];

        for(int i = 1; i<=adet ; i++){
            System.out.println("lütfen "+ i+". sayiyi giriniz = ");
            numbers[i-1]=input.nextInt();

        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int fark = numbers[numbers.length-1]-numbers[0];
        System.out.println("Fark = "+fark);

    }
}
