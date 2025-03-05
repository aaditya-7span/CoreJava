package overriding.vehicle_sys;

public class Car extends Vehicle{

    @Override
    public void startEngine(){
        System.out.println("starting car engine");
    }
}
