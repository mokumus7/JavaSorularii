package sorucozumu.transfer;

public class Runner {

    public static void main(String[] args) {

        System.out.println("\n\n");

        TransferEdecegimSolAcik pavalNedved = new TransferEdecegimSolAcik();

        System.out.println("\n\n");



        System.out.println("Pavel Nedved ====>");
        pavalNedved.sporYap();
        pavalNedved.futbolOyna();
        pavalNedved.hizliKos();
        pavalNedved.sayAyakKullan();

        System.out.println("\n");
        TransferEdecegimSolAcik pavalNedved1 = new TransferEdecegimSolAcik(27,177,"Cek");

        System.out.println("\n");

        TransferEdecegimSolAcik pavalNedved2 = new TransferEdecegimSolAcik(3500000);

    }
}
