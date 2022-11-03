package Inheritance.inherit;

public class MyCalculation extends Calculation {
    public static void main(String[] args) {


       Calculation cal = new Calculation();

        cal.toplama(10,5);
        cal.cikarma(20,10);


        MyCalculation cal2 = new MyCalculation();
        cal2.toplama(a,b);
        cal2.cikarma(a,b);
        cal2.carpma(a,b);
        cal2.bolme(a,b);

    }

/*
*****obje olusturmadan super ile parenttan merhot variable constructor lara ulasabiliriz.
 */
    public void carpma(int x, int y){
        z=x*y;
        System.out.println("Verilen sayilarin carpimi = "+ z);
        super.toplama(10,5);
    }

    public void bolme(int x, int y){
        z=x/y;
        System.out.println("Verilen sayilarin bolumu = "+ z);




    }
}
