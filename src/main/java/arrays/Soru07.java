package arrays;

public class Soru07 {
    public static void main(String[] args) {

        //Verilen bir String'deki sesli harf sayısını bulunuz


        String str = " Dadaloglu der ki; Eyy Arkadas selam sana...";
        str=str.toLowerCase();
        String arr[] = str.split("");

        int sum=0;
        for(String w: arr){

            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                  sum++;
            }

        }

        System.out.println(sum);
    }
}
