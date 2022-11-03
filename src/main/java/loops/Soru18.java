package loops;

public class Soru18 {
    public static void main(String[] args) {

 //Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.

        String s = "Christmas";
        String bos= "";

        //1.YOl
        for (int i = 0 ; i<s.length(); i++ ) {
            String str = s.substring(i,i+1);
            if (str.equals("m")){
                break;
            }
            bos+=str;
        }
        System.out.println(bos);
        System.out.println();
    //2.YOL

        String a = "Christmas";

        int b= 0;
     while (b<a.length()){
         String str = a.substring(b,b+1);
             if(str.equals("m")){
                 break;
             }
         System.out.print(str);
        b++;
     }

        System.out.println();
     //3.Yol

        String d= "Christmas";

     int f =0;

     do {
         char ch = d.charAt(f);

         if(ch =='m'){
             break;
         }
         System.out.print(ch);

         f++;
     }while (f<d.length());



    }
}
