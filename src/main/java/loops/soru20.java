package loops;

public class soru20 {
    public static void main(String[] args) {
        //Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.

        //1.YOL
        String str = "Muhammet";
        str= str.toLowerCase();

        for (int i =0; i<str.length();i++ ){
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.print(ch + " ");
            }
        }

        System.out.println();

        //2.YOL

        String sss= "Seeelammmm";
        sss=sss.toLowerCase();


        int i = 0;

        while (i<sss.length()){

            String a =sss.substring(i,i+1);

            if( sss.indexOf(a)==sss.lastIndexOf(a)){
                System.out.print(a + " ");
            }

            i++;
        }

        System.out.println();
    //3.YOL

    String b = "Meerhaaabaa";
       b=b.toLowerCase();
        int c=0;


        do {
            char a = b.charAt(c);

            if( b.indexOf(a)==b.lastIndexOf(a)){
                System.out.print(a + " ");
            }

            c++;
        }while (c<b.length());

    }
}
