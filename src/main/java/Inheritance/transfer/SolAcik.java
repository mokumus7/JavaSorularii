package Inheritance.transfer;

public class SolAcik extends Futbolcu{


    int yas;
    String ulke;

    public SolAcik(){
        super("Cek",10000000);

        System.out.println("Sol Acik class'indan =  bos ");

    }

    public SolAcik(int yas){
        super("Cek",10000000,3500000,177);
        this.yas=yas;

        System.out.println("Sol Acik class'indan = yas'");

    }

    public SolAcik(int yas,String ulke){
        this.yas=yas;
        this.ulke=ulke;

    }

    public  void hizliKos(){
        System.out.println("Hizli kosabilir.");
    }


}
