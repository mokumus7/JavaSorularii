package loops;

public class Soru04 {
    public static void main(String[] args) {

 /*
       Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
             Örnek; 223878 ´ 37
  */
        //1.YOL
        
        int a = 1723412356;

        String aString = String.valueOf(a);

       String bos ="";

        for(int i = 0;i<aString.length(); i++){

            String str = aString.substring(i,i+1);

            if(aString.indexOf(str)==aString.lastIndexOf(str)){
                bos = bos +str;
            }
        }
        
        int sonSayi= Integer.valueOf(bos);
        System.out.println("sonSayi = " + sonSayi);


        //2.yol

        int aa = 1232345;

        String aaStr = String.valueOf(aa);


        int b = 0;
        while (b<aaStr.length()){
            String sss= aaStr.substring(b,b+1);
          if  (aaStr.indexOf(sss)==aaStr.lastIndexOf(sss)){
              System.out.print(sss);
          }
          b++;
        }

        System.out.println();
      //3.YOL

      int bb = 12123445;
        String bbStr= String.valueOf(bb);

        int d = 0;
        do {
           String zz= bbStr.substring(d,d+1);

           if(bbStr.indexOf(zz)==bbStr.lastIndexOf(zz)){

               System.out.print(zz);
           }

          d++;
        }while (d<bbStr.length());





    }
}
