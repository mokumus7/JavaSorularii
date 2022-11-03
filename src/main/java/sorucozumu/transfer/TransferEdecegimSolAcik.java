package sorucozumu.transfer;

public class TransferEdecegimSolAcik extends SolAcik {


    int maas;
    int boy;
    String ulke;

    public void sayAyakKullan(){

        System.out.println("Sag ayagini kullanabilir.");
    }

    public TransferEdecegimSolAcik(){
          super(27);
        System.out.println("TransferEdecegimSolAcik 'dan ===> bos");

    }
    public TransferEdecegimSolAcik(int maas){
        super(27);
      this.maas = maas;
        System.out.println("TransferEdecegimSolAcik'dan ===> maas");
    }

    public TransferEdecegimSolAcik(int yas, int boy, String ulke){

        this.maas = yas;
        this.boy = boy;
        this.ulke = ulke;

        System.out.println("TransferEdecegimSolAcik'dan ===>  yas + boy + ulke");

    }
}
