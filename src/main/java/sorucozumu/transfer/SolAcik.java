package sorucozumu.transfer;

public class SolAcik extends Futbolcu {

    public void hizliKos(){
        System.out.println("Hizli kosabilir.");
    }

   int yas;
    int bonservis;
    int boy;

    public SolAcik(){
    super(3500000,10000000);
        System.out.println("SolAcik'dan ===> bos");

    }

    public SolAcik(int yas){
        this(1000000,177);
        this.yas = yas;
        System.out.println("SolAcik'dan ====> yas");
    }

    public SolAcik(int bonservis, int boy){
        super("Cek");
        this.bonservis = bonservis;
        this.boy = boy;

        System.out.println("SolAcik'dan ====> bonservis + boy'");

    }
}
