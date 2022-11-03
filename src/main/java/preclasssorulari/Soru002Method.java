package preclasssorulari;

public class Soru002Method {


        /*
        Kullanicidan bir strin isteyin ve stringi tersine ceviren method yazin.
         */


        public static String tersCvir (String a){
                String b="";

            for(int i = a.length()-1; i>-1; i--){
                    String str = a.substring(i,i+1);
                    b+= str;
            }
            return b ;



        }

}
