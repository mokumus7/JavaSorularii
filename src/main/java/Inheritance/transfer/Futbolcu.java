package Inheritance.transfer;

public class Futbolcu extends Sporcu{


    String ulke;
    int bonservis;

    int maas;
    int boy;
    public Futbolcu(){

    }

    public Futbolcu(String ulke){
        this.ulke = ulke;

    }

    public Futbolcu(String ulke, int bonservis){
        super("Futbolcu");
        this.ulke = ulke;
        this.bonservis = bonservis;
        System.out.println("Futbolcu class'indan =  ulke ve bonservis");

    }

    public Futbolcu(String ulke, int bonservis,  int maas, int boy){
        super("Futbolcu");
        this.ulke = ulke;
        this.bonservis = bonservis;
        this.maas = maas;
        this.boy = boy;
        System.out.println("Futbolcu class'indan =  ulke , bonservis , maas ve boy");

    }

    public  void futbolOyna(){
        System.out.println("Futbol oynayabilir.");
    }

}

