package sorucozumu.transfer1;

public class Runner {

    public static void main(String[] args) {

        TransferEdecegimSolAcik pavelNedved = new TransferEdecegimSolAcik();


        System.out.println("==========================================");


        System.out.println("Pavel Nedved: " );
        pavelNedved.sporYap();
        pavelNedved.futbolOyna();
        pavelNedved.hizliKos();
        pavelNedved.sagAyak();

        System.out.println("==========================================");

        TransferEdecegimSolAcik pavelNedved1 = new TransferEdecegimSolAcik(350000);


    }
}
