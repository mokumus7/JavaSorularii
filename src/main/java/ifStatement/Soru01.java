package ifStatement;

import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args) {

        //Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        // a)  Aralık, Ocak, Şubat için "Kış"
        // b) Mart, Nisan, Mayıs için "İlkbahar"
        // c) Haziran, Temmuz, Ağustos için "Yaz"
        // d) Eylül, Ekim, Kasım için "Sonbahar"
        // e) Diğerleri için "Geçersiz ay adı"


        Scanner input=new Scanner(System.in);

        System.out.println("Lutfen bir ay adi giriniz : ");

        String ayAdi = input.next();

          if(   ayAdi.equalsIgnoreCase("aralik")||
                ayAdi.equalsIgnoreCase("ocak") ||
                ayAdi.equalsIgnoreCase("subat")){

            System.out.println("Kiş");

        } else if (ayAdi.equalsIgnoreCase("mart") ||
              ayAdi.equalsIgnoreCase("nisan")||
                      ayAdi.equalsIgnoreCase("mayis"))
        {
            System.out.println("Ilkbahar");

          }else if (ayAdi.equalsIgnoreCase("haziran") ||
                  ayAdi.equalsIgnoreCase("temmuz")||
                  ayAdi.equalsIgnoreCase("agustos"))
          {
              System.out.println("Yaz");

          }else if (ayAdi.equalsIgnoreCase("eylul") ||
                  ayAdi.equalsIgnoreCase("ekim")||
                  ayAdi.equalsIgnoreCase("kasim"))
          {
              System.out.println("Sonbahar");

          }else{
              System.out.println("Gecersiz ay adi...");
          }
    }
}
