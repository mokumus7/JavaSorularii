package sorucozumu.accessmodi01;

public class Car {


    public  String brand = "Ford";

    protected  String model ="Camry";

    String color = "White";

    private String carNumberPlate= "TR 34FC 6302";

    public static void main(String[] args) {


        Car car1 = new Car();

       car1.start();
       car1.speed();
       car1.stop();


    }


    void speed (){
        System.out.println("car speed" +
                "");
    }
    public void start(){

        System.out.println("Car start");
    }

    protected void stop(){
        System.out.println("Car stop");

    }

}
