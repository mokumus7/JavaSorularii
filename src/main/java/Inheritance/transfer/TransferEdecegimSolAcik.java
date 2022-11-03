package Inheritance.transfer;

public class TransferEdecegimSolAcik extends SolAcik {



    int maas;
    int yas;
    int boy;



    public TransferEdecegimSolAcik(){
        super(27);
        System.out.println("TransferEdecegimSolAcik ====>bos");

    }

    public TransferEdecegimSolAcik(int maas){
        this.maas = maas;

    }

    public TransferEdecegimSolAcik(int maas, int yas){
        this.maas=maas;
        this.yas=yas;

    }

    public TransferEdecegimSolAcik(int maas, int yas, int boy){

        this.maas=maas;
        this.yas=yas;
        this.boy=boy;

        System.out.println("Transefer edecegim sol acik class'indan = maas, yas ve boy");

    }

  public void SagAyak(){
       System.out.println("Sag ayagini kullanabilir.");
   }

}
