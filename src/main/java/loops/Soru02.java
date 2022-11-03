package loops;



public class Soru02 {
    public static void main(String[] args) {
        // Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
        //Örneğin; accessories ´ ces

        //1.Yol
        String s = "accessories";
        String sonuc ="";
        for (int i = 0; i < s.length(); i++) {
             String str = s.substring(i,i+1);
             if (s.indexOf(str)!=s.lastIndexOf(str)){

                    if(!sonuc.contains(str)){
                        sonuc = sonuc+str;
                    }
                 }
            }


        System.out.println( "for = "+sonuc);
        System.out.println();

        //2.yol
        String  sss= "accessories";
        String snc="";
        int m = 0;
        while(m<sss.length()){
            String sh = sss.substring(m,m+1);
                  if(sss.indexOf(sh)!=sss.lastIndexOf(sh)){
                      if (!snc.contains(sh)){
                          snc=snc+sh;
                      }
                  }
                  m++;
        }
        System.out.println("while = " + snc);


            //3.YOL
        String a = "comolokko";
        String tekrarliOlanlar ="";

        int b =0;

        do {
            String d =a.substring(b,b+1);
            if(a.indexOf(d)!=a.lastIndexOf(d)){
                if (!tekrarliOlanlar.contains(d)){
                     tekrarliOlanlar=tekrarliOlanlar+d;
                }
            }
         b++;
        }while (b<a.length());

        System.out.println("do = "+ tekrarliOlanlar);


        }



    }
