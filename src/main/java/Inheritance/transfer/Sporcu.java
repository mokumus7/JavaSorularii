package Inheritance.transfer;

public class Sporcu {

    String brans;
    public Sporcu(){

    }

    public Sporcu(String brans){
        this.brans = brans;
        System.out.println("Sporcu Class'indan =  brans");

    }

    public  void sporYap(){
        System.out.println("Spor yapabilir.");
    }
}
