package Inheritance.inherit;

public class Child extends  Parent{

    Child(){
        super();
        System.out.println("Child parametresiz cons calisti");
    }
    Child(int c){
        super(5);
        System.out.println("Child parametresiz cons calisti");
    }

    Child(int sayi1, int sayi2){

        super(5,6);
        System.out.println("Child 2 parametli cons calisti");

    }

    public static void main(String[] args) {


      Child child = new Child(8,9);
      Child child1 = new Child(8);




    }
}
