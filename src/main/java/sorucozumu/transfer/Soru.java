package sorucozumu.transfer;

public class Soru {
    /*


     Galatasaraya  futbolcu transfer etmek istiyorum :

        1. Ulkesi    = Cek
        2. Yas       = 27
        3. Bonservis = 10.000.000 $
        4. Boy       = 177
        5  Maas      = 3.500.000 $


       # Yetenek #
        1. Spor yapabilen
        2. Futbol oynayabilen
        3. Hizli kosabilen
        4. Sag ayagini kullanabilen

     */






    //                           ulke = yas= bonservis = boy = maas

//        Sporcu      >     Furbolcu        >      SolAcik   >         TransferEdecegimSolAcik
//        1.bos              1.bos                1.bos                   1. bos
//        2.brans            2.ulke               2.yas                   2. maas
//                           3.maas               3.bonservis
//                             bonservis            boy
//                           4.ulke,
//                             bonservis,                                 3. yas
//                             maas,                                         boy
//                             boy                                           ulke
//
//          2-------------------4-----------------------2------------------------1------------
//          2-------------------3-----------------------1------------------------3------------
//          2-------------------2-  --------------------2--3----------------------2------------
}
