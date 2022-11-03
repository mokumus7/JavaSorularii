package sorucozumu.transfer;

public class Futbolcu extends Sporcu {

    public void futbolOyna(){
        System.out.println("Futbol oynayabilir.");
    }


    String ulke;
    int maas;
    int bonservis;
    int boy;

    public Futbolcu(){

    }

    public Futbolcu(String ulke){
        super("Futbolcu");
    this.ulke = ulke;

        System.out.println("Futbolcu'dan ====> ulke");
    }

    public Futbolcu(int maas, int bonservis){
        super("Futbolcu");
        this.maas = maas;
        this.bonservis = bonservis;

        System.out.println("Futbolcu'dan ====> maas+ bonservis");

    }

    public Futbolcu(String ulke,  int bonservis, int maas, int boy){
        super("Futbolcu");
        this.ulke = ulke;
        this.bonservis = bonservis;
        this.maas = maas;
        this.boy = boy;

        System.out.println("Futbolcu'dan ====> ulke , bonservis , maas, boy");
    }
}
