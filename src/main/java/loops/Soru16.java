package loops;

public class Soru16 {

    public static void main(String[] args) {
        //Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.


        String str = "aslmert";
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='m'){
                break;
            }
            System.out.print(ch);
        }


        System.out.println();


        String ssss= " asdmedfg";
        String bos = "";

        int a =0;

        do {
        String b =  ssss.substring(a,a+1);

         if(b.equals("m")){
             break;
         }
         bos+=b;

            a++;
        }while(a<ssss.length());

        System.out.println(bos);
    }
}
