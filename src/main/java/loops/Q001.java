package loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Q001 {

    static List<Integer> satirElemanlari = new ArrayList<>();


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Kac satir olmasini istiyorsunuz ? ");
        int satir = input.nextInt();
        int a = 1;

        satirElemanlari.add(1);
        satirElemanlari.add(1);

        for (int i = 1; i < 3; i++) {

            for (int k = 1; k <= satir - i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
//ilk 2 satir yukarisi





        }

    }





