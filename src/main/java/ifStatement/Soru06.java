package ifStatement;

public class Soru06 {

    /*

    Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla

     */
    public static void main(String[] args) {




    int i = 124;



      if(i%10>=5){
        System.out.println("Son basamağı bir üst ondalığa yuvarla :"+ (i/10+1)*10);
        }else{
        System.out.println("Son basamağı bir alt ondalığa yuvarla : " + (i/10)*10);
     }
   }
    }