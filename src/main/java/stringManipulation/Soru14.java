package stringManipulation;

public class Soru14 {

    public static void main(String[] args) {


    /*
    Bir String’ in belirli bir tek karaktere sahip olup 
    olmadığını üç farklı şekilde kontrol etmek için kod yazınız.
     */

        
        String aaa = "a";
        
        //1.yol
       boolean ilkYol= aaa.length()==1;

        System.out.println("ilkYol = " + ilkYol);
       
        //2.Yol
      boolean ikincisart=  aaa.charAt(0) == aaa.charAt(aaa.length()-1);

        System.out.println("ikincisart = " + ikincisart);
      
        //3.Yol
        
       boolean ucuncuYol= aaa.indexOf("a")==aaa.lastIndexOf("a");

        System.out.println("ssss = " + ucuncuYol);


        //4.yol
       boolean dort = aaa.lastIndexOf("a")==0;

        System.out.println("dort = " + dort);

}
}
