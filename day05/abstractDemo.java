
abstract class vehicle{
    abstract void takeinput(); //declaration
}

class Car extends vehicle{
    @Override
    void takeinput() {
        System.out.println("This is Car class");
    }
}

class Bike extends vehicle{
    @Override
    void takeinput() {
        System.out.println("This is bike class");
    }
}


public class abstractDemo {


    static void vehicleType(vehicle V){
         V.takeinput();
    }
    public static void main(String []args){
        
     vehicleType(new Bike());
     vehicleType(new Car());


    }

}