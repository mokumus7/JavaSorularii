package sorucozumu.transfer;

public class Sporcu {

    public void sporYap(){
        System.out.println("Spor yapabilir.");

    }


    String brans;

    public Sporcu(){

    }

    public Sporcu(String brans){
          this.brans=brans;
        System.out.println("Sporcu'dan ===> brans");
    }


}
