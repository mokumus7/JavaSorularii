package Inheritance.transfer;

public class Runner {

    /*

        Galatasaraya  futbolcu transfer etmek istiyorum :
        1. Ulkesi    = Cek
        2. Yas       = 27
        3. Bonservis = 10.000.000 $
        4. Boy       = 177
        5  Maas      = 3.500.000 $


        Ability
        1.spor yapan
        2.futbol oynayan
        3.hizli kosan
        4.sag ayagini kullanan--

     */

//
//       Sporcu      >     Furbolcu        >      SolAcik   >         TransferEdecegimSolAcik
//        1.bos              1.bos                1.bos                   1.bos
//        2.brans            2.ulke               2.yas                   2.maas
//                           3.ulke               3.yas                   3.maas
//                             bonservis            ulke                    yas
//                           4.ulke,                                       4.maas
//                             bonservis,                                    yas
//                                                                           boy
//                             maas,
//                             boy)
//          2                 3                       1                      4
//          2-----------------4---------------------2------------------------1---
    public static void main(String[] args) {



//obje
        TransferEdecegimSolAcik transfer = new TransferEdecegimSolAcik(3500000,27,177);


            transfer.hizliKos();
            transfer.sporYap();
            transfer.futbolOyna();
            transfer.SagAyak();
        System.out.println("===============================");
        TransferEdecegimSolAcik transfer1 = new TransferEdecegimSolAcik();


        }



  //




    }


